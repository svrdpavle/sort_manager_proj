package sort_manager.handlers.input_handler;

import sort_manager.handlers.output_handler.Printer;
import java.util.Scanner;

/**
 * This class handles any input from the user
 */
public class InputHandler {
    /**
     * Returns a string of the sorter name after the user is asked to input a int corresponding to the sorter menu displayed
     * @return string of the sorter that has been selected
     */
    public static String sorterName() {
        Scanner sc = new Scanner(System.in);
        int sorterNumber;

        do {
            Printer.printEnterSorterNumMsg();

            while (sc.hasNextInt() == false) {
                Printer.printInputErrorMsg();
                sc.next();
            }

            sorterNumber = sc.nextInt();
        } while (sorterNumber < 1 || sorterNumber > 3);

        if (sorterNumber == 1) {
            return "Binary Tree";
        } else if (sorterNumber == 2) {
            return "Bubble";
        } else {
            return "Merge";
        }
    }

    /**
     * Returns the int entered by the user
     * <p>
     *    Int entered must be 1 or greater and less than the max int value
     * </p>
     * @return size of the array determined by the user input
     */
    public static int chooseArraySize() {
        Scanner sc = new Scanner(System.in);
        int arraySize;

        do {
            Printer.printArrayMsg();

            while (sc.hasNextInt() == false) {
                Printer.printInputErrorMsg();
                sc.next();
            }

            arraySize = sc.nextInt();
        } while (arraySize < 1 || arraySize > Integer.MAX_VALUE);

        return arraySize;
    }
}
