package lt.lhu.lesson2.main;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner  keyboard = new Scanner(System.in);
		System.out.println("Please enter the number for a:");
		double a = keyboard.nextDouble();
		
		Scanner keyboard1 = new Scanner(System.in);
		System.out.println("Please enter the number for b:");
		double b = keyboard1.nextDouble();
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.println("Please enter the number for c:");
		double c = keyboard2.nextDouble();

	double answ = (a*a) - ((b-c)*(b-c)) + Math.log((b*b)+1);
	System.out.println("Answer: (a*a) - ((b-c)*(b-c)) + Math.log((b*b)+1) = " + answ );

	keyboard.close();
	keyboard1.close();
	keyboard2.close();
	
}
}