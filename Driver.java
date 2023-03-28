import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        SortedIntegerList sortedIntegerList = new SortedIntegerList();
        Scanner scanner = new Scanner(System.in);
        int LIST_LENGTH = 10;

        int i = 0;
        while (i < LIST_LENGTH) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            sortedIntegerList.addInteger(number);
            i++;
        }

        System.out.println(sortedIntegerList.getListContent());

        sortedIntegerList.sortWithSelectionSort();

        System.out.println(sortedIntegerList.getListContent());
    }
}
