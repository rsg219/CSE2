import java.util.Scanner;
//import required to use Scanner
public class Methods {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );
		//creates instance of Scanner
		int numElements = 10;
		//number of elements
		double numTotal=0;
		//total sum
		double nMed1=0.0;
		double nMed2=0.0;
		//holds the two numbers used to find the median
		
		for(int i=0;i<numElements;i++){
		    System.out.print("Enter a number: ");
		    int numTemp =myScanner.nextInt ();
		    numTotal= numTotal+numTemp;
		    //prompts for a number that is added to the total
		    if(i==((numElements)/2)-1){
		        nMed1=numTemp;
		    }
		    //finds the lesser of the two numbers in the middle of ten
		    if(i==(numElements/2)){
		        nMed2=numTemp;
		    }
		    //finds the greater of the two numbers in the middle of ten
		}
		findMean(numElements,numTotal);
		findMedian(nMed1,nMed2);
		//calls the two methods for mean and method
    }
    
    public static void findMean(int numElements,double numTotal){
        double numMean = (numTotal/numElements);
        //finds the mean of the numbers entered
        System.out.print("The mean is ");
        print(numMean);
        //sets up and calls the method for printing
    }
    
    public static void findMedian(double nMed1,double nMed2){
        double numMedian = (nMed1+nMed2)/2;
        //finds the median of the numbers entered
        System.out.print("The median is ");
        print(numMedian);
        //sets up and calls the method for printing
    }
    
    public static void print(double printed){
        System.out.println(printed);
        //prints the recieved variable
    }
}
