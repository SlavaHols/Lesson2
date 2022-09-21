package lt.lhu.lesson2.main;

public class Task09 {
	public static void main(String[] args) {
		double x = 2;
		double fx ;
		
	
			if (x <= -3) {
		 fx = 9;
		 System.out.println("F(x) = " + fx);
		} else
		if (x > 3) { 
			fx = 1 / (x * x + 1);
		System.out.println("F(x) = " + fx);
	}
	else {
		System.out.println("X diapozon (-2 to 3) .");
		}
	}
}

