import java.util.Scanner;
//import required to use Scanner

public class averageGrade {
    
    public static void main(String[] args){

		Scanner myScanner = new Scanner (System.in );
		//creates instance of Scanner
		
		int grade =0;
		int count =0;
		int totalGrade = 0;
		//creates grade int, total int, and number of grades
		
		while (grade != 999){
		    System.out.print ("Enter a grade greater then 0 and less then 100:");
		    grade =myScanner.nextInt ();
		    //gets a grade
		    if (grade > -1 && grade <101){
		        totalGrade = totalGrade + grade;
		        count = count+1;
		    }
		    //accepts a grade if its between 0 and 100
		    else if (grade !=999){
		        System.out.println ("An invalid grade has been entered. It won't be counted");
		    //prints an invalid note if it isn't accepted but also isn't 999
		    }
		}
		totalGrade = (totalGrade/count);
		System.out.println ("The average grade is " +totalGrade);
		//finds and prints the average
    }
}