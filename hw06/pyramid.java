import java.util.Scanner;
public class pyramid {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );
		//creates instance of Scanner
        
        System.out.print ("What size pyramid? ");
		int rowCount=myScanner.nextInt ();
		//gets pyramid size
		
		for(int i = 0;i < rowCount;i++){
		    int spaceCount = (rowCount-i-1);
		    //gets the number of spaces so that it decreases each row
		    
		    while(spaceCount> 0){
		        System.out.print(" ");
		        spaceCount=spaceCount-1;
		    }
		    //prints the spaces
		    
		    for(int b=0;b<((i*2)+1);b++){
		        System.out.print("*");
		    }
		    //prints the number of *'s
		    
		    System.out.println ("");
		    //moves the pyramid to a new line 
		}
    }
}