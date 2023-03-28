import java.util.ArrayList;

public class SortedIntegerList_Exception {
    private ArrayList<Integer> integers = new ArrayList<Integer>();

    /** give out exception when input is out of range  */
    public void addInteger(int integer) {
        if (integer >= 0 && integer <= 100) {
            integers.add(integer);
        } else {
            throw new IllegalArgumentException("Invalid integer! The integer should be between greater than or equal to 0 and lesser than or equal to 100.");
        }
    }

    public void sortWithSelectionSort() {
        for (int i = 0; i < integers.size(); i++) {

            int minIndex = i;
            for (int j = i+1; j < integers.size(); j++) {
                if (integers.get(j) < integers.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = integers.get(i);
            integers.set(i, integers.get(minIndex));
            integers.set(minIndex, temp);
        }
    }

    public String getListContent() {
        String result = "";
        String separator = "";
        for (int i = 0; i < integers.size(); i++) {
            // initially, when printing out the integer at index 0, separator will be an empty string
            // so, no separator will be printed out when printing the first integer
            // before printing out the next integer, we set separator = ", "
            // that's why there is a separator between the first and second integers, e.g. 1, 2
            result += separator + integers.get(i);
            separator = ", ";
        }
        return result;
    }
}
