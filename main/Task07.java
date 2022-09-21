package lt.lhu.lesson2.main;

public class Task07 {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = -2;
		
		if (a > 0) {
			a = a * a;
		} else
			a = a*a*a*a;
		System.out.println("a = " + a + ";");
		
		if (b > 0 ) {
			b = b * b;
		} else 
			b = b*b*b*b;
		System.out.println("b = " + b + ";");
		
		if (c > 0 ) {
			c = c * c;
		}	else
			c = c*c*c*c;
		System.out.println("c = " + c + ".");
		
		}
	}

