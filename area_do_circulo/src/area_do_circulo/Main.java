package area_do_circulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double raio = sc.nextDouble();
		double area = Math.pow(raio, 2) * 3.14159;

		System.out.printf("A = %f%n", area);
		sc.close();
	}

}
