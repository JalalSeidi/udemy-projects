package Learning.company;

import java.util.Scanner;

public class MinimumElement {

    /**
     * Reads in an integer from the user
     * @return the amount of elements that user needs to enter
     */
    public static int readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    /**
     * Reads from the console until all the elements are entered.
     * @param arrayLength the length of the array.
     * @return an array containing the elements entered.
     */
    public static int[] readElements(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    /**
     * Checks the elements for minimum.
     * @param array of the elements that were entered by user.
     * @return the minimum value in the array.
     */
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
