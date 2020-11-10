package java_module1_assignment;

public class ForLoopTenEvenTenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to print 10 even numbers and 10 odd numbers
		for(int i = 1; i < 21; i++) {
			if(i%2 == 0) {
				System.out.println(i + " is even number");
			} else {
				System.out.println(i + " is odd number");
			}
		}
	}

}
