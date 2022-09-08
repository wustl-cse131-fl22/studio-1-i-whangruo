package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Number1 is:");
		int n1 = in.nextInt();
		System.out.println("Number2 is:");
		int n2 = in.nextInt();
		double avg = (n1 + n2) / 2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + avg + ".");
		
	}

}
