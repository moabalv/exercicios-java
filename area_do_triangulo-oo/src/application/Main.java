package application;
import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle triangle = new Triangle();
		
		triangle.a = sc.nextDouble();
		triangle.b = sc.nextDouble();
		triangle.c = sc.nextDouble();
		
		double area = triangle.area();
		System.out.printf("Area: %f", area);
		
		sc.close();
		
		

	}

}
