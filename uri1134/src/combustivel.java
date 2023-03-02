import java.util.Scanner;
public class combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pref, alcool, diesel, gasolina;
		alcool = diesel = gasolina = 0;
		
		pref = sc.nextInt();
		
		while (pref != 4) {
			if (pref == 1) {
				alcool += 1;
			}
			else if (pref == 2) {
				gasolina += 1;
			}
			else if (pref == 3) {
				diesel += 1;
			}
			pref = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d %n", gasolina);
		System.out.printf("Diesel: %d %n", diesel);
		
		sc.close();
	}

}
