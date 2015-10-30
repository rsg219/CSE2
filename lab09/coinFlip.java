import java.util.Scanner;
//import required to use Scanner

public class coinFlip{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );
        
        int n=0;
        int b = flip();
                if (b==0){
            System.out.println("tail 1 head 0");
        }
        else if (b==1){
            System.out.println("tail 0 head 1");
        }
        
        do{
            System.out.print("Enter an integer between 0 and 100: ");
            n = myScanner.nextInt();
        
            int heads=0;
            int tails=0;
            while(n>0){
            flip(n,heads,tails);
            n--;
            }
        
        }while(n<101);
    }
    public static void flip() {
        double a = (Math.random()*2);
        int b = (int)a;
        return b;
    }
    public static void flip(int n, int heads,int tails) {
        while(n>0){
            flip();
            if (b==0){
              tails++;
             }
             else if (b==1){
                heads++;
            }
        }
    }
}
