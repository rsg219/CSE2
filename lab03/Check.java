
import java.util.Scanner;
//import required to use Scanner

public class Check{
    //main method required for every Java program public static void main
    public static void main (String[] args)  {
        
        Scanner myScanner = new Scanner (System.in );
        //creates instance of Scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        //input of the cost of the check
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;
        //input of the tip percentage thwy wish to pay
        
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt ();
        //input the number of people paying
        
        double totalCost;
        double costPerPerson;
        // Variables for the total cost of the check including tip and cost per person
        int dollars,dimes,pennies;
        // Variables to display the amount each person uses in a xx.xx form
        
        
        totalCost=checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        // Calculates the total Cost and cost per person
        
        
        dollars=(int)costPerPerson;
        dimes=(int)(costPerPerson * 10)%10;
        pennies=(int)(costPerPerson * 100)%10;
        //S plits the cost per person into a whole number, a number to the first decimal place,
        //and a number to the second place for an xx.xx form
        System.out.println("Each person in the group owes $" +dollars + '.' +dimes+pennies);
        //Displays the cost per person in xx.xx form
    } //end of main method
} //end of class