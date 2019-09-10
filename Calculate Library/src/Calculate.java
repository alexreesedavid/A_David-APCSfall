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
	public static String toImproperFrac(int whole, int numerator, int denominator) {// input in a mixed number and output that number as an improper fraction
		int newNumerator = (whole * denominator) + numerator;
		return newNumerator + "/" + denominator;
	}
	public static String toMixedNum(int numerator, int denominator) { // input in an improper fraction and output that fraction as a mixed number
		int whole = numerator / denominator;
		int newNumerator = numerator % denominator;
		return whole + " " + newNumerator + "/" + denominator;
	}
	public static String foil(int a, int b, int c, int d, String variable) { //converts binomial expression(ax + b)(cx + d) to quadratic equation ax^2 + bx + c; input variable correspond to (ax + b)(cx + d) form with x standing in as "variable"
		int quadraticA = a * c;
		int quadraticB = (b * c) + (a * d);
		int quadraticC = b * d;
		return quadraticA + variable + "^2" + "+" + quadraticB + variable + "+" + quadraticC;
	}
	
}
