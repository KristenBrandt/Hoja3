import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	create("Archivo.txt");
    	ArrayList[] Lista = ReadFile("./Numbers.txt");
    	GnomeSort.gnomeSort(Lista);
    	Merge.mergeSort(Lista, Lista.length);
    }
       
        public static int read (String Archivo) {
        	 try {
             	FileReader Lector = new FileReader(Archivo) {
             	BufferedReader reader = new BufferedReader(Lector);
             	comparar[] NumA = new comparar [3000];
             	int x = 0;
             	String LectorL = reader.readLine();
             	while (LectorL != null) {
             		comparar cArray = new comparar(x);
             		NumA[x] = cArray;
             		LectorL = reader.readLine();
             		x = x + 1; 
             	}
             	}catch(Exception var10) {
             		
             	}
             	return NumA;
        }
        public static void create (String Archivo) {
            	try {
            		File file = new File(Archivo);
        			FileOutputStream fileS = new FileOutputStream(file);
        			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fileS));
        			Random random = new Random();
        			for(int i = 0; i<3000; i++) {
        				int Num = random.nextInt(3000);
        				bw.write(Num);
        			}
        			bw.close();
        			
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
            	
                
            }   
        }
