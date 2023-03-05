package conversor_dolar_oo;
import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?" );
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double reais = CurrencyConverter.convert(dollarPrice, dollars);
		System.out.printf("Amount to be paid in reais = %.2f%n", reais);
		sc.close();

	}

}
