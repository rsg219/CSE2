import java.util.Scanner;
public class Test107 {
    
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
/*
import java.util.Scanner;
public class Test2 {
    
    public static void main(String[] args){

     int n = 50;
     for(int r=0;r<n; r++){
          for(int c=0;c<n;c++){
               System.out.print("*");
          }
          System.out.println("");
     }
    }
}

     for(int r=1;r<10; r++){
          for(int c=1;c<10;c++){
               System.out.print(r*c + " ");
          }
          System.out.println("");
     }
*/