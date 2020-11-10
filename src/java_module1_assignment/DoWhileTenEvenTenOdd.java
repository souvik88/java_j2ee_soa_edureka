package java_module1_assignment;

import java.util.Scanner;

public class DoWhileTenEvenTenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userScan = new Scanner(System.in);
		System.out.println("Enter the number 1 to get 10 even & odd numbers: ");
		int userInput = userScan.nextInt();
		do {
			if (userInput % 2 == 0) {
				System.out.println(userInput + " is even");
				userInput++;
			} else {
				System.out.println(userInput + " is odd");
				userInput++;
			}
		} while (userInput < 21);
		userScan.close();
	}
}