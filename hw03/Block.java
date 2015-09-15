import java.util.Scanner;
//import required to use Scanner

public class Block{
    //main method required for every Java program public static void main
    public static void main (String[] args) 
    {
        Scanner myScanner = new Scanner (System.in );
        //creates instance of Scanner
        
        System.out.print ("Enter the length of the block: ");
        double blockLength = myScanner.nextDouble ();
        System.out.print ("Enter the width of the block: ");
        double blockWidth = myScanner.nextDouble ();
        System.out.print ("Enter the height of the block: ");
        double blockHeight = myScanner.nextDouble ();
        //gets the dimensions of the block
        
        double blockArea = blockLength*blockWidth*blockHeight;
        double blockSurface =((2*(blockLength*blockHeight))+(2*(blockHeight*blockWidth))+(2*(blockWidth*blockLength)));
        //calculates the area and surface area
        
        System.out.print ("The volume of the block of dimensions is " +blockArea +".\n");
        System.out.print ("The surface area of the block is " +blockSurface +".\n");
        //displays the area and surface area of the block
    }
}