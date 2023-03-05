package application;
import entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		double pontos = aluno.pontos();
		System.out.println("FINAL GRADE = " + String.format("%.2f", pontos));
		
		if (aluno.aprovado()) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - pontos);
			
		}
		
		sc.close();
	}

}
