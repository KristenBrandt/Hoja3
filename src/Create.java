import java.util.Random;

public class Create {

    public static void ListadeNumeros(int num, int min, int max) {
        Random random = new Random();
        random.ints(num,min, max).forEach(System.out::println);
    }
}
