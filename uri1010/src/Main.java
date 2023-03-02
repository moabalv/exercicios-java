import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		double price1, price2, valor;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		price1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		valor = num1 * price1 + num2 * price2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();
		
	}

}
