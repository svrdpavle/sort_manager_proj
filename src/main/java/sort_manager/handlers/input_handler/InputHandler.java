package sort_manager.handlers.input_handler;

import sort_manager.handlers.output_handler.Printer;

import java.util.Scanner;

// Class that manages any user input

public class InputHandler {
    public static String chooseSorter() {
        Scanner sc = new Scanner(System.in);
        int sorterNumber;

        /*
         do/while loop
         while sortNumber is less than 1 or greater than 3, the block of code will continue to execute.
         */
        do {
            // asks the user to enter a number corresponding to the sorter menu
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
