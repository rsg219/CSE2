import java.util.Scanner;
public class Test2 {
    
    public static void main(String[] args){

          double n = 1.0;
		double nH = 0;
		
		while (n <50000){
		     nH = nH + (1/n);
		     n++;
		}
		System.out.println(nH);
    }
}