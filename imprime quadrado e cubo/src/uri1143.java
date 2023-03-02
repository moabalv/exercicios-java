import java.util.Scanner;
public class uri1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int quad, cub;
		
		for (int i = 1; i <= N; i++) {
			quad = i * i;
			cub = i * i * i;
			
			System.out.printf("%d %d %d%n", i, quad, cub);
		}
		sc.close();
	}

}
