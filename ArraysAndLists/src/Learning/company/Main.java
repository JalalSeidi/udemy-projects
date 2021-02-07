package Learning.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Exercise 41
//        System.out.println("Enter the size of your Array");
//        SortedArray sortedArray = new SortedArray();
//        int[] myIntegers = sortedArray.getIntegers(scanner.nextInt());
//        int[] sorted = sortedArray.sortIntegers(myIntegers);
//        sortedArray.printArray(sorted);

//      Exercise 42
//        MinimumElement minimumElement = new MinimumElement();
//        int count = minimumElement.readIntegers();
//        int[] array = minimumElement.readElements(count);
//        int minimum = minimumElement.findMin(array);
//        System.out.println("min = " + minimum);

//      Exercise 43
//        ReverseArray reverseArray = new ReverseArray();
//        int[] array = { 2, 3, 4, 6 ,8 ,9 ,10};
//        System.out.println("Array = " + Arrays.toString(array));
//        ReverseArray.reverse(array);
//        System.out.println("Reversed array = " + Arrays.toString(array));

//      Exercise 44
//          Contact contact1 = new Contact("jalal", "09214017053");
//          Contact contact2 = new Contact("Nahid", "0045654");
//          MobilePhone mobilePhone = new MobilePhone("12");
//          mobilePhone.addNewContact(contact1);
//          mobilePhone.addNewContact(contact2);
//          mobilePhone.printContacts();
//          mobilePhone.removeContact(contact2);
//          mobilePhone.printContacts();

//        Exercise 45
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);


        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);

    }
}
