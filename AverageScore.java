/*
 This class is using Scanner to requst user imput midterm and final score.
 Then, calculate the average score and print out Pass/Fail.
*/
import java.util.Scanner;

public class AverageScore{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int midtermScore;
		int finalScore;
		double averageScore;
		
		System.out.println("Enter the midterm score: ");
		midtermScore = scan.nextInt();//reads midterm score input from user;
		
		System.out.println("Enter the final score: ");
		finalScore = scan.nextInt();//reads final score from user input;
		
		averageScore = (midtermScore + finalScore)/2.0;
	
		/*
		if(averageScore >= 70){
				System.out.println("Pass!");
		}else{
			System.out.println("Fail!");
		}
		*/
		
		
		
      } //ends main
}//end class