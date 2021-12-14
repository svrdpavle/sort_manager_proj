package sort_manager.start;

import sort_manager.managers.InputManager;
import sort_manager.managers.OutputManager;

public class Loader {
    public static void start() {
        // printIntroMsg method is called from the OutputManager class
        OutputManager.printIntroMsg();

        // chooseSorter method is called from the InputManager class
        InputManager.chooseSorter();

        // chooseArraySize method is called from the InputManager class
        InputManager.chooseArraySize();

    }
}
