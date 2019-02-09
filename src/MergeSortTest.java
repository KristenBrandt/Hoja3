import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
            Comparable []arr = {3,2,10};
            MergeSort.mergeSort(arr,arr.length);
            String correcto = "[2, 3, 10]";
            String coso = Arrays.toString(arr);
            Assert.assertEquals(correcto,coso);
    }
}