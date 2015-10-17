import java.util.Scanner;
public class encrypted_x {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );
		//creates instance of Scanner
		
		System.out.print("Enter the size of the square: ");
		int squareSize=myScanner.nextInt ();
		
		if(squareSize <0 || squareSize >100){
		    System.exit(-1);
		}
		for(int i = 0; i < squareSize; i++){
		    
		    for(int j = 0; j < squareSize; j++){
		        if(i==j|| j==(squareSize-i-1)){
		            System.out.print(" ");
		        }
		        else{
		        System.out.print("*");
		        }
		    }
		    System.out.println("");
		}
    }
}