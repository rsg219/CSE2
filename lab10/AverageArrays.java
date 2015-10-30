import java.util.Scanner;
//import required to use Scanner

public class AverageArrays{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );
        //creates instance of Scanner
        System.out.print("Enter the  size of the array: ");
        int n = myScanner.nextInt();
        //asks the user for the size of the array
        int[] intArray;
        intArray = new int[n];
        //creates an array using the user-definined size
        for(int count =0;count<n;count++){
             intArray[count]= (int)(Math.random()*101);
        }
        //Assigns random numbers to the array
         
        int arraySum = 0;
        for(int count =0;count<n;count++){
             arraySum = arraySum+ intArray[count];
        }
        //finds the total sum for the array
        int arrayAverage = arraySum/n;
        //finds the average value for the array
        System.out.println("The sum of the array is: " +arraySum);
        System.out.println("The average of the sum is: " +arrayAverage);
        //displays the sum and average of the array
        
        for(int count =0;count<n;count++){
            if ((intArray[count])>= arrayAverage){
                 System.out.println(intArray[count]);
        }
        //print any values that are above average
        }
    }
}