package java_module1_assignment;
import java.util.Scanner;

public class WhileLoopMultiplicationOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to generate tables of 10 using While Loop
		Scanner userScan = new Scanner(System.in);
		System.out.println("Type number 10 to see its multiplication table: ");
		int userInput = userScan.nextInt();
		int i = 1;
		while(i <= userInput) {
			System.out.printf("%d * %d = %d \n", userInput, i, userInput * i);
			i++;
		}
		userScan.close();
	}
}
