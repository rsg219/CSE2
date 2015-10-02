import java.util.Scanner;
//import required to use Scanner

public class Timer{
    //main method required for every Java program public static void main
    public static void main (String[] args)  
        {
        
        Scanner myScanner = new Scanner (System.in );
        //creates instance of Scanner
        
        System.out.print ("Enter the current time: ");
        int rawTime = myScanner.nextInt ();
        //gets the current time
        
        System.out.print ("Enter the time that you will be eating dinner: ");
        int dinnerTime = myScanner.nextInt ();
        //gets the target time
        
        int timeHours = (dinnerTime-rawTime)/100;
        int timeMinutes = (dinnerTime-rawTime)%100;
        //splits the current time into minutes and hours
        
        System.out.print ("You have " +timeHours +" hours and " +timeMinutes +" minutes until dinner;");
        //displays the time between the current time and dinner time
        }
}