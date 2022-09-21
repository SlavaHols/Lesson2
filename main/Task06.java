package lt.lhu.lesson2.main;

public class Task06 {
	public static void main(String[] args) {
		double a = 2.0;
		double b = 3.0;
		double c = 4.0;
		double d = 5.0;
		
		double result = ((a / c) * (b / d)) - ((a * b - c) / (c * d));
		System.out.println("Result : ((a / c) * (b / d)) - ((a * b - c) / (c * d)) = " + result);
	}
}
