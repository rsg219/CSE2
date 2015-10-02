import java.util.Scanner;
//import required to use Scanner

public class timeSheets {
    
    public static void main(String[] args){

		Scanner myScanner = new Scanner (System.in );
		//creates instance of Scanner
		
		int totalPay= 0;
		
		System.out.print ("How many employees are there:");
		int employeeCount=myScanner.nextInt ();
		
		for(int i = 0;i <employeeCount; i++){
		    System.out.print ("What is the pay, in cents, for employee number " +(i+1) +" : ");
		    int payPerHour=myScanner.nextInt ();
		    
		    int totalHours = 0;
		    
	        for(int a=0;a <5; a++){
	            System.out.print ("How many hours did they work on day " +(a+1) +" : ");
	            int dailyHours=myScanner.nextInt ();
	            totalHours=totalHours+dailyHours;
	        }
	        
	        totalPay=totalPay+(totalHours*payPerHour);
		}
		System.out.print ("The total payroll of all employees in cents is : " +totalPay);
    }
}