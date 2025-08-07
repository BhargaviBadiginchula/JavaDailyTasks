import java.util.*;

public class Sorting1DStringArrayInDescending {
    public static void main(String[] args) {
        String[] b = {"Bhavesh", "Shiv", "Rudra", "Mahakal", "Bholenath", "Shankar"};

        // Sort array in ascending order first
        Arrays.sort(b);

        // Create a new array to store descending order
        String[] revSortB = new String[b.length];

        // Copy elements from end of sorted array to the new array
        int index = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            revSortB[index++] = b[i];
        }

        // Print descending sorted array
        System.out.println(Arrays.toString(revSortB));
    }
}
