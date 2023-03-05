package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convert(double dollarPrice, double dollar) {
		double reais = dollarPrice * dollar;
		return reais + (reais * IOF);
	}
}
