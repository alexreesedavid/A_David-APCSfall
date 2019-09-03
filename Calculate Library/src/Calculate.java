// Alex David 8/29/2019
//APCS3rd
//Library of math functions

public class Calculate {
	public static int square(int number) { //square the input
		int answer = number * number; 
		return answer;
	}
	
	public static int cube(int number) { //cube the input
		int answer = number * number * number;
		return answer;
	}
	
	public static double average(double number1 , double number2) {//average two inputs
		double answer = (number1 + number2) / 2;
		return answer;
	}
	
	public static double average(double number1 , double number2 , double number3) {//average three inputs
		double answer = (number1 + number2 + number3) / 3;
		return answer;
	}
	public static double toDegrees(double radian) {//convert radians to degrees
		double answer = radian * (180/3.14159);
		return answer;
	}
	public static double toRadians(double degrees) {//convert degrees to radians
		double answer = degrees * (3.14159/180);
		return answer;
	}
	public static double discriminant (double variableA, double variableB, double variableC) {//input are coefficients for quadratic equation then returns the discriminant
		double answer = (variableB * variableB) - 4 * variableA * variableC;
		return answer;
	}
	public static String improperFrac (int whole, int numerator, int denominator) {//input a mixed number and change to improper fraction
		int ansNumerator = whole * denominator;
		String improperFrac =  "ansNumerator / denominator";
		return String improperFrac;
	}
	
}
