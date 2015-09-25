import java.util.Scanner;
//import required to use Scanner

public class CalculatorSpecial {
    
    public static void main(String[] args) 
    {
        
         Scanner myScanner = new Scanner (System.in );
        //creates instance of Scanner
        
        String stop = "";
        //sets a variable to stop the wile loop
        
        while (!(stop .equals("n") || stop .equals("N"))){
    
        System.out.print ("Enter the first integer: ");
        int intA = myScanner.nextInt ();
        System.out.print ("Enter the second integer: ");
        int intB = myScanner.nextInt ();
        //gets the two integers
        
        System.out.print ("Enter an operator(‘*', '-'. '+', or '/'): ");
        String operator = myScanner.next();
        //gets the operators
        
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
        //print the output of the integers depending on the operator and
        //if the operator isn't valid, outputs Illegal operator
        
        System.out.print ("Type n or N to stop. Type y or Y to continue.");
        stop = myScanner.next();
        
        }
    }
}