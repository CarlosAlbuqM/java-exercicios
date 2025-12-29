package util;

public class Calculator {

	public static final double PI = 3.14159; // Para uma variável se tornar constante devemos adicicional o final.
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
