
public class comparar implements Comparable <comparar> {
	int x;
	comparar(int x){
		this.x=x;
	}
	@Override
	public int compareTo(comparar other) {
		if(x==other.x) { 
			return 0;  
		}else if(x>other.x) {  
			return 1;  
		}else {  
			return -1;  
			}  
	}
	public int getNum ()
	   {
	      return x;
	   }
}
