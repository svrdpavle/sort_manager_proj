package sort_manager.start;

import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.input_handler.InputHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;
import sort_manager.utils.Timer;

public class Loader {
    public static void start() {
        // printIntroMsg method is called from the OutputManager class
        Printer.printIntroMsg();

        // chooseSorter method is called from the InputManager class and assigned to a variable
        String chosenSorter = InputHandler.chooseSorter();
        Printer.printSorterSelectedMsg(chosenSorter);

        // chooseArraySize method is called from the InputManager class and assigned to a variable
        int chosenArrSize = InputHandler.chooseArraySize();

        Sorter sorter = SortFactory.sorterFactory(chosenSorter);

        int[] arr = ArrayHandler.randomArray(chosenArrSize);
        // clone the randomised arr to prevent it from being overridden
        int[] tempArr = arr.clone();

        Timer timer = new Timer();
        timer.setStartTime(System.nanoTime());

        try {
            int[] sortedArr = sorter.sortArray(tempArr);
            timer.setEndTime(System.nanoTime());
            long timeTaken = timer.getTimeDiff();
            Printer.printResults(chosenSorter, arr, sortedArr, timeTaken);
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
