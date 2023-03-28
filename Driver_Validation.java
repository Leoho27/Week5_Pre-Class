import java.util.Scanner;

public class Driver_Validation {
    public static void main(String[] args) {
        SortedIntegerList_Validation sortedIntegerList = new SortedIntegerList_Validation();
        Scanner scanner = new Scanner(System.in);
        int LIST_LENGTH = 10;

        /** if input within range, the incrementing continue */
        int i = 0;
        while (i < LIST_LENGTH) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            boolean isValid = sortedIntegerList.addInteger(number);
            // if the input is valid, move on to the next number
            if (isValid) {
                i++;
            }
            // if the input is invalid, print an error message and stay at the same index
            // so that the user can re-input the number
            else {
                System.out.println("Invalid integer! The integer should be between greater than or equal to 0 and lesser than or equal to 100.");
            }
        }

        System.out.println(sortedIntegerList.getListContent());

        sortedIntegerList.sortWithSelectionSort();

        System.out.println(sortedIntegerList.getListContent());
    }
}
