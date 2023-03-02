import java.util.Scanner;
public class uri1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in, out, X;
		in = out = 0;
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			
			if (X >= 10 && X <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		sc.close();
	}

}
