package sort_manager.start;

import sort_manager.handlers.array_handler.ArrayHandler;
import sort_manager.handlers.input_handler.InputHandler;
import sort_manager.handlers.output_handler.Printer;
import sort_manager.sorters.SortFactory;
import sort_manager.sorters.Sorter;

import java.util.Arrays;

public class Loader {
    public static void start() {
        // printIntroMsg method is called from the OutputManager class
        Printer.printIntroMsg();

        // chooseSorter method is called from the InputManager class and assigned to a variable
        String chosenSorter = InputHandler.chooseSorter();

        // chooseArraySize method is called from the InputManager class and assigned to a variable
        int chosenArrSize = InputHandler.chooseArraySize();

        Sorter sorter = SortFactory.sorterFactory(chosenSorter);
        System.out.println("Sorted picked: " + sorter);

        int[] arr = ArrayHandler.randomArray(chosenArrSize);
        System.out.println("Random array: " + Arrays.toString(arr));

        int[] sortedArr = sorter.sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}
