package sort_manager.start;

import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.input_handler.InputHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;

import java.util.Arrays;
import java.util.Locale;

public class Loader {
    public static void start() {
        // printIntroMsg method is called from the OutputManager class
        Printer.printIntroMsg();

        // chooseSorter method is called from the InputManager class and assigned to a variable
        String chosenSorter = InputHandler.chooseSorter();

        // chooseArraySize method is called from the InputManager class and assigned to a variable
        int chosenArrSize = InputHandler.chooseArraySize();

        Sorter sorter = SortFactory.sorterFactory(chosenSorter);

        int[] arr = ArrayHandler.randomArray(chosenArrSize);
        // clone the randomised arr to prevent it from being overridden
        int[] tempArr = arr.clone();

        int[] sortedArr = sorter.sortArray(tempArr);

        Printer.printResults(chosenSorter, arr, sortedArr);
    }
}
