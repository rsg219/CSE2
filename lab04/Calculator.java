import java.util.Scanner;
//import required to use Scanner

public class Calculator {
    
    public static void main(String[] args) 
    {
    
         Scanner myScanner = new Scanner (System.in );
        //creates instance of Scanner
    
        System.out.print ("Enter the first integer: ");
        int intA = myScanner.nextInt ();
        System.out.print ("Enter the second integer: ");
        int intB = myScanner.nextInt ();
        
        System.out.print ("Enter an operator(‘*', '-'. '+', or '/'): ");
        String operator = myScanner.next();
        
        switch(operator){
               case "*":
                    System.out.print(intA*intB+"\n");
                    break;
                case "-":
                    System.out.print(intA-intB+"\n");   
                    break;
                case "+":
                    System.out.print(intA+intB+"\n"); 
                    break;
                case "/":
                    System.out.print(intA/intB+"\n"); 
                    break;
                default:
                    System.out.println("Illegal operator");
        }
    }
}