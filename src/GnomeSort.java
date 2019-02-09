public class GnomeSort implements Comparable<Integer> {

    //sacado de Java the complete reference, seventh edition
    static void gnomeSort(Comparable[] arr, int n)
    {
        int index = 0;

        while (index < n) {
            if (index == 0 ||arr[index-1].compareTo(arr[index]) <= 0)
                index++;
            else {
                Comparable temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
