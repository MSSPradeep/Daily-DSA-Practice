package SortingAlgorithms;

public class InsertionSort {

    public void InsertionSortImpl(int[] array){

        int size = array.length;
        for(int currentElement=1; currentElement< array.length;currentElement++){
            int key = array[currentElement];
            int previousElement = currentElement-1;

            while(previousElement >= 0 && array[previousElement] > key){
                array[previousElement+1] = array[previousElement];
                previousElement = previousElement-1;
            }
            array[previousElement+1] = key;
        }
    }
}
