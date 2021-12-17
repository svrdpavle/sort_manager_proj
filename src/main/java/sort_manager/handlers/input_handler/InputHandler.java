package sort_manager.handlers.input_handler;

import sort_manager.handlers.output_handler.Printer;

import java.util.Scanner;

/*
Class that manages any user input
 */

public class InputHandler {
    public static String chooseSorter() {
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
