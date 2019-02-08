import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Create {

    public static void ListadeNumeros(int num, int min, int max) {
        int arr[] = new int[num];
        Random random = new Random();
        //File text = new File();
        random.ints(num,min, max).forEach(System.out::println);
        //random.ints(num,min, max).forEach(arr.add);


    }
}

