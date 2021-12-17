package sort_manager.start;

/*
Class that loads methods from the different classes
 */

import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.input_handler.InputHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;
import sort_manager.utils.Timer;

public class Loader {
    public static void start() {
        Printer.printIntroMsg();

        String chosenSorter = InputHandler.chooseSorter();

        Printer.printSorterSelectedMsg(chosenSorter);

        int chosenArrSize = InputHandler.chooseArraySize();

        Sorter sorter = SortFactory.sorterFactory(chosenSorter);

        int[] arr = ArrayHandler.randomArray(chosenArrSize);

        int[] tempArr = arr.clone();

        try {
            Timer timer = new Timer();
            timer.setStartTime(System.nanoTime());

            int[] sortedArr = sorter.sortArray(tempArr);

            timer.setEndTime(System.nanoTime());
            long timeTaken = timer.getTimeDiff();

            Printer.printResults(chosenSorter, arr, sortedArr, timeTaken);
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
