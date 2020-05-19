import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Range of x: ");
		System.out.print("Lower bound: ");
		double lowerX = read.nextDouble();
		System.out.print("Upper bound: ");
		double upperX = read.nextDouble();
		System.out.println();

		System.out.println("Range of y: ");
		System.out.print("Lower bound: ");
		double lowerY = read.nextDouble();
		System.out.print("Upper bound: ");
		double upperY = read.nextDouble();
		System.out.println();

		System.out.print("Number of approximations along X: ");
		double nX = read.nextDouble();
		System.out.print("Number of approximations along Y: ");
		double nY = read.nextDouble();
		System.out.println();

		System.out.print("Along x-axis: (1)Left, (2)Midpoint, or (3)Right approximation? ");
		int xChoice = read.nextInt();
		System.out.print("Along y-axis: (1)Lower, (2)Midpoint, or (3)Upper approximation? ");
		int yChoice = read.nextInt();
		System.out.println();
		
		double xInterval = (upperX - lowerX)/nX;
		double yInterval = (upperY - lowerY)/nY;
		
		
		double result = 0;
		
		//Midpoint
		for(double i = lowerX; i < upperX; i += xInterval) {
			double currX;
			switch(xChoice) {
				case 2: currX = i + xInterval/2; break;
				case 3: currX = i + xInterval; break;
				default: currX = i;
			}
			for(double j = lowerY; j < upperY; j += yInterval) {
				double currY;
				switch(yChoice) {
					case 2: currY = j + yInterval/2; break;
					case 3: currY = j + yInterval; break;
					default: currY = j;
				}
				System.out.println("i: " + i + " j: " + j);
				result += equation(currX, currY) * (xInterval)*(yInterval);
			}
		}

		System.out.println("Result: " + result);
		
	}
	
	
	public static double equation(double x, double y) {
		double result = 1 + x * Math.exp(-y);
		result = Math.sqrt(result);
		return result;
	}
}
