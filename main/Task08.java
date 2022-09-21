package lt.lhu.lesson2.main;

public class Task08 {
	public static void main(String[] args) {
		for(double a = 0; a <= 98; a++) {
			int h = 2;
			double x = a + h;
			double fx = 2 * (Math.tan(x/2)) + 1;
			System.out.println("When x = "+ x + "   " + "F(x) = " + fx);
			System.out.println(" " );
		}
	}
}
