package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double pontos() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean aprovado() {
		if (pontos() >= 60.00) {
			return true;
		}
		else {
			return false;
		}
	}
}
