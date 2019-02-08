import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {3,2,-1};
        //Para hacer la lista
        System.out.println("Ingrese el numero de datos que quiere en su lista (se puede un numero de 10 a 3000:");
        int numeros = input.nextInt();
        System.out.println("Se esta generando una lista con " + numeros + " numeros....");
        Create.ListadeNumeros(numeros,1,1000);
         // TODO: 2019-02-07 LOS NUMEROS GENERADOS TIENEN QUE SER GUARDASDOS EN UNA LISTA

        GnomeSort.gnomeSort(arr, arr.length);
        System.out.print("Lista ordenada utilizando Gnome Sort: ");
        System.out.println(Arrays.toString(arr));


        MergeSort.mergeSort(arr,arr.length);
        System.out.print("Lista ordenada utilizando Merge Sort:");
        System.out.println(Arrays.toString(arr));

    }

}
