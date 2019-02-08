import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arry = new ArrayList<Integer>();

        //Para hacer la lista
        System.out.println("Ingrese el numero de datos que quiere en su lista (se puede un numero de 1 a 3000:");
        int numeros = input.nextInt();
        System.out.println("Se esta generando una lista con " + numeros + " numeros....");
        Create.ListadeNumeros(numeros,1,1000);
        @// TODO: 2019-02-07 LOS NUMEROS GENERADOS TIENEN QUE SER GUARDASDOS EN UNA LISTA

        //La lista arr es solo para probar si sirve
        int arr[] = { 34, 2, 10, -9 };
        GnomeSort.gnomeSort(arr, arr.length);
        System.out.print("Lista ordenada utilizando Gnome Sort: ");
        System.out.println(Arrays.toString(arr));

        @// TODO: 2019-02-07 TODAVIA NO SIRVE ESTA PARTE 
        int arra[] = { 34, 2, 10, -9 };
        //MergeSort.mergeSort(arra,);
        System.out.println(Arrays.toString(arra));

    }

}
