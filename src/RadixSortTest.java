import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RadixSortTest {

    @org.junit.Test
    public void radixsort() {
        int arr[] = {3,2,10};
        RadixSort.radixsort(arr,arr.length);
        String correcto = "[2, 3, 10]";
        String coso = Arrays.toString(arr);
        Assert.assertEquals(correcto,coso);

    }
}