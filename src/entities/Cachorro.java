package entities;

public class Cachorro {

	public double peso;
	public double altura;
	public String nome;
	public String personalidade;
	public char sexo;

	public void latir() {
		System.out.println("O cachorro está 'latindo'");
	}

	public void andar() {
		System.out.println("O cachorro está 'andando' ");
	}

	public void pular() {
		System.out.println("O cachorro está 'pulando'");
	}
}
