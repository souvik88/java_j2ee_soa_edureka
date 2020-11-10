package java_module1_assignment;

public class PositiveOrZeroOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check whether the given number is positive, zero or negative
		int num = 0;
		if(num > 0) {
			System.out.println(num + " is a positive number");
		} else if(num < 0){
			System.out.println(num + " is a negative number");
		} else {
			System.out.println("num is equal to 0");
		}
	}
}
