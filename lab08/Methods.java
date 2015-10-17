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
		
		for(int i=0;i<numElements;i++){
		    System.out.print("Enter a number: ");
		    int numTemp =myScanner.nextInt ();
		    numTotal= numTotal+numTemp;
		    if(i==((numElements)/2)-1){
		        nMed1=numTemp;
		    }
		    if(i==(numElements/2)){
		        nMed2=numTemp;
		    }
		}
		findMean(numElements,numTotal);
		findMedian(nMed1,nMed2);
    }
    
    public static void findMean(int numElements,double numTotal){
        double numMean = (numTotal/numElements);
        System.out.print("The mean is ");
        print(numMean);
    }
    
    public static void findMedian(double nMed1,double nMed2){
        double numMedian = (nMed1+nMed2)/2;
        System.out.print("The median is ");
        print(numMedian);
    }
    
    public static void print(double printed){
        System.out.println(printed);
    }
}
