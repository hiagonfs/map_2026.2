package codigo;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;

	public Aluno(String nome, double nota1, double nota2) {
		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			throw new IllegalArgumentException("Nota inválida!");
		}
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}

	public boolean estaAprovado() {
		return calcularMedia() >= 7;
	}

}
