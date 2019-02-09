import java.io.*;
import java.util.Random;

public class Create {

    public static void ListadeNumeros (String archivo ) throws IOException {
    	try {
			FileOutputStream file = new FileOutputStream("Archivo.txt");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(file));
			Random random = new Random();
			for(int i = 0; i<3000; i++) {
				int Num = random.nextInt(3000);
				bw.write(Num);
			}
			bw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	
        
    }   
}

