import java.util.Scanner;

public class Euler {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); 
		
		System.out.print("Step size: ");
		double step = kb.nextDouble();
		
		System.out.print("Initial x: ");
		double x = kb.nextDouble();
		
		System.out.print("Initial y: ");
		double y = kb.nextDouble();
		
		System.out.print("Endpoint: ");
		double end = kb.nextDouble();
		
		System.out.println(euler(step, x, y, end));
	}
	
	public static double euler(double step, double x, double y, double end) {
		
		//Enter slope equation here
		double slope = Math.pow(Math.E, -y);

		y += (slope) * step;
		x = x + step;

		
		
		System.out.println("x: " + x + "\ty: " + y + "step" + step);
		
		if(x >= end - step/2)
			return y;

		return euler(step, x, y, end);
	}
}
