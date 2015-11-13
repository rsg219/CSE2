import java.util.Scanner;
//import required to use Scanner

public class MineSweeper{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );
        //creates instance of scanner
        
        System.out.print("Enter the size of the board (between 2 and 30) : ");
        int n = myScanner.nextInt();
        //gets the size of the board from user
        
        int[][] board=new int[n][n];
        //creates board
        
        System.out.print("Enter the number of mines between (1 and " +n*n +") : ");
        int m = myScanner.nextInt();
        //gets the number of mines
        
        for(int placeM =m;placeM>0;placeM--)
            board[(int)(Math.random()*n)][(int)(Math.random()*n)] = 1;
        //randomly places the mines in the board
            
        int[][] searchBoard =new int [n+2][n+2];
        for(int column = 1; column<(n+1); column++){
            for(int row = 1; row<(n+1); row++){
                searchBoard[column][row]=board[column-1][row-1];
            }
        }
        //creates a second board with an empty trim around a copy of the first board
        //so the search for mines can use the same loop for a space on the edge of the 
        //board as well as inside the board without ever going out of bounds
        
        for(int column = 1; column<n+1; column++){
            for(int row = 1; row<n+1; row++){
                int mineCount=0;
                if(searchBoard[column][row]== 1){
                     System.out.print("M");
                    }
                //finds out if the spot is occupied by a mine
                 
                if (searchBoard[column][row-1]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column][row+1]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column-1][row-1]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column+1][row-1]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column-1][row+1]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column+1][row+1]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column+1][row]==1)
                    mineCount = mineCount+1;
                if (searchBoard[column-1][row]==1)
                    mineCount = mineCount+1;
                //finds if a mine is in one of the eight adjecent spaces and adds to a tally
                    
                if(searchBoard[column][row] != 1){
                    System.out.print(mineCount);
                //prints the number of mines in adjecent spaces if the space isn't occupied by a mine
                }
                
                }
                System.out.println(" ");
                //moves to the next row
        }
    }
}