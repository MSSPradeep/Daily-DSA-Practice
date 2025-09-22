package SortingAlgorithms;

public class BubbleSort {

    public void BubbleSortImpl(int[] array) {

        int size = array.length;
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < size; i++) {
            swapped = false;
            for (j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

    }
}
