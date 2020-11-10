package java_module1_assignment;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check if a candidate is eligible for voting or not
		int age = 61;
		if(age >= 18 && age >=60) {
			System.out.println("You are a senior citizen and you are eligible to vote");
		} else if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote, you have to wait until 18th birthday");
		}
	}
}
