package sort_manager.start;

import sort_manager.managers.ArrayManager;
import sort_manager.managers.InputManager;
import sort_manager.managers.OutputManager;
import sort_manager.sorters.Sorter;

import java.util.Arrays;

public class Loader {
    public static void start() {
        // printIntroMsg method is called from the OutputManager class
        OutputManager.printIntroMsg();

        // chooseSorter method is called from the InputManager class and assigned to a variable
        String chosenSorter = InputManager.chooseSorter();

        // chooseArraySize method is called from the InputManager class and assigned to a variable
        int chosenArraySize = InputManager.chooseArraySize();

        Sorter sorter = SortFactory.sorterFactory(chosenSorter);
        System.out.println("Sorted picked: " + sorter);

        int[] array = ArrayManager.randomArray(chosenArraySize);
        System.out.println("Random array: " + Arrays.toString(array));
    }
}
