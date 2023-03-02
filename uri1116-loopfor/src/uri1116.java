import java.util.Scanner;
import java.util.Locale;
public class uri1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N, num1, num2;
		double divisao;
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if (num2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				divisao = (double) num1 / num2;
				System.out.printf("%.1f%n", divisao);
			}
		}
		sc.close();
		
	}

}
