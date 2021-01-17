package Learning.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of your Array");
        SortedArray sortedArray = new SortedArray();
        int[] myIntegers = sortedArray.getIntegers(scanner.nextInt());
        int[] sorted = sortedArray.sortIntegers(myIntegers);
        sortedArray.printArray(sorted);
    }
}
