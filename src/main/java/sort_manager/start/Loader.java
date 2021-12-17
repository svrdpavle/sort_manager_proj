package sort_manager.start;

import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.input_handler.InputHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;
import sort_manager.utils.Timer;

/**
 * This class loads various methods from different classes found in the project
 */
public class Loader {
    /**
     * When called upon, the program will start and the following methods are run
     */
    public static void start() {
        Printer.printIntroMsg();

        String chosenSorter = InputHandler.sorterName();

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
