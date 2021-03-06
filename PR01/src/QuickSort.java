/**
 * Created by EricWolfe on 1/23/2017.
 */
public class QuickSort {

    //Constructor for running quick sort
    public QuickSort(int[] array) { quickSort(array, 0, array.length);}

    //Main quicksort function
    private void quickSort(int[] array, int low, int high){
        if (low < high){
            int pivot_location = partition(array, low, high);
            quickSort(array, low, pivot_location);
            quickSort(array, pivot_location+1, high);
        }
    }

    //runs the parition for quick sort
    private int partition(int array[], int low, int high){
        int pivot = array[low];
        int leftwall = low;

        for (int i = low + 1; i < high; i++){
            if (array[i] < pivot){
                swap(array, i, leftwall);
                leftwall++;
            }
        }

        return leftwall;
    }

    //Swap function for when curren position and the leftwall
    private void swap(int array[], int num1, int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
}
