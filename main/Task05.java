package lt.lhu.lesson2.main;

public class Task05 {
	public static void main(String[] args) {
		double a = 1.0;
		double b = 2.0;
		double c = 3.0;
		
		double sqrt = Math.sqrt(b*b + 4*a*c);
		double cuba = a*a*a;
		double solution = ((b + sqrt) / (2 * a)) - ((cuba*c) + b);
		System.out.println("Answer = " + solution);
	}

}
