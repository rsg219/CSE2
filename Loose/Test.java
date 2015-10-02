import java.util.Scanner;
public class Test {
    
    public static void main(String[] args){

		Scanner myScanner = new Scanner (System.in );
		
		System.out.print ("Enter the starting balance in the form of XX.XX: ");
        double balance = myScanner.nextDouble ();
        
        System.out.print ("Enter the interest rate in the form of X% (without the %): ");
        double interest = myScanner.nextDouble ();
        
        System.out.print ("Enter the rate years: ");
        int rateYear = myScanner.nextInt ();
        
        while(rateYear > 0){
        balance = balance+((interest/100)*balance);
        rateYear= rateYear-1;
		}
		System.out.print ("The Ending Balance is " +balance);
    }
}