package entities;

public class Cachorro {

	public double peso;
	public double altura;
	public String nome;
	public String personalidade;
	public char sexo;

	public void latir() {
		System.out.println("O cachorro est� 'latindo'");
	}

	public void andar() {
		System.out.println("O cachorro est� 'andando' ");
	}

	public void pular() {
		System.out.println("O cachorro est� 'pulando'");
	}
}
