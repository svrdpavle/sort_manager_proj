package sort_manager.managers;

import java.util.Scanner;

// Class that manages any user input

public class InputManager {
    public static void chooseSorter() {
        Scanner sc = new Scanner(System.in);
        int sorterNumber;

        /*
         do/while loop
         while sortNumber is less than 1 or greater than 3, the block of code will continue to execute.
         */
        do {
            // asks the user to enter a number corresponding to the sorter menu
            OutputManager.printEnterSorterNumMsg();
            // !! code here to check if the user input is anything but an int !!
            sorterNumber = sc.nextInt();
        } while (sorterNumber < 1 || sorterNumber > 3);

        if (sorterNumber == 1) {
            System.out.println("Binary Tree Sorter selected!");
        }
        else if (sorterNumber == 2) {
            System.out.println("Bubble Sorter selected!");
        }
        else {
            System.out.println("Merge Sorter selected!");
        }
    }

    public static int chooseArraySize() {
        Scanner sc = new Scanner(System.in);
        int arraySize;

        do {
            OutputManager.printArrayMsg();
            // !! code here to check if the user input is anything but an int !!
            arraySize = sc.nextInt();
        } while (arraySize < 1 || arraySize > Integer.MAX_VALUE);

        return arraySize;
    }
}
