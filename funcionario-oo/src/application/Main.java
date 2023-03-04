package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

// Lê nome, salário bruto e impostos pagos pelo funcionário. Lê a porcentagem do aumento e atualiza os dados.

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("Employee: " + funcionario);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.print("Updated data: " + funcionario);

		sc.close();

	}

}
