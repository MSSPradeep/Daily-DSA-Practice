package SortingAlgorithms;

public class selectionSort {

    private void selectionSortImpl(int[] array){

        int size = array.length;

        for(int currentElement=0;currentElement<size-1; currentElement++){

            int minIndex = currentElement;

            for(int i = currentElement+1; i<size;i++){
                if(array[minIndex] > array[i] )
                    minIndex = i;
            }

            int temp = array[currentElement];
            array[currentElement] = array[minIndex];
            array[minIndex] = temp;
        }


    }
}
