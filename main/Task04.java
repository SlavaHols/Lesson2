package lt.lhu.lesson2.main;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner  keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number for a:");
		int a = keyboard.nextInt();
		
		System.out.println("Please enter the number for b:");
		int b = keyboard.nextInt();
		
		System.out.println("Please enter the number for c:");
		int c = keyboard.nextInt();
		
		int summ = a + b + c ;
		System.out.println("Summ : a + b + c = " + summ+ ".");
		keyboard.close();
	}
}
