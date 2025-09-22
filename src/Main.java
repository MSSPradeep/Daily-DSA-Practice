import LogicBuilding.Patterns;
import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{5,6,1,3};

        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Before calling Insertion Sort -> "+ Arrays.toString(array));
        insertionSort.InsertionSortImpl(array);
        System.out.println("After calling Insertion Sort -> "+ Arrays.toString(array));
    }
}