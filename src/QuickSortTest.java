import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
            int arr[] = {3,2,10};
            //QuickSort.(arr,arr.length);
            String correcto = "[2, 3, 10]";
            String coso = Arrays.toString(arr);
            Assert.assertEquals(correcto,correcto);
    }
}