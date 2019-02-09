import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GnomeSortTest {

    @Test
    public void gnomeSort() {
            Comparable []arr = {3,2,10};
            GnomeSort.gnomeSort(arr,arr.length);
            String correcto = "[2, 3, 10]";
            String coso = Arrays.toString(arr);
            Assert.assertEquals(correcto,coso);
    }
}