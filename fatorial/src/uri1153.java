import java.util.Scanner;
public class uri1153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double fatorial = N;
		
		for (int i = 1; i < N; i++) {
			fatorial = fatorial * (N - i);
		}
		System.out.printf("%f%n", fatorial);
		sc.close();
	}

}
