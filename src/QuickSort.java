import java.util.*;
public class QuickSort implements Comparable<Integer> {

    //sacado de Java the complete reference, seventh edition
    private int partition(Comparable[] arr, int begin, int end) {
        Comparable pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot)<0) {
                i++;

                Comparable swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Comparable swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public void quickSort(Comparable[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}