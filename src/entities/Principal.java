package entities;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		Cachorro x = new Cachorro();
		char sair;

		do {
			System.out.println("Nome");
			x.nome = sc.next();
			System.out.println("Sexo");
			x.sexo = sc.next().charAt(0);
			System.out.println("Peso");
			x.peso = sc.nextDouble();
			System.out.println("Altura");
			x.altura = sc.nextDouble();
			System.out.println("Personalidade");
			x.personalidade = sc2.nextLine();

			System.out.println("\nOque o cachorro está fazendo? \n1. Latindo \n2. Andrando\n3. Pulando");
			int acaoCachorro = sc.nextInt();

			System.out.println("\n\nNome: " + x.nome);
			System.out.println("Peso: " + x.peso + "Kg");
			System.out.printf("Altura: %.2f \n", x.altura);
			System.out.println("Sexo: " + x.sexo);
			System.out.println("Personalidade: " + x.personalidade);

			if (acaoCachorro == 1) {
				x.latir();
			} else {
				if (acaoCachorro == 2) {
					x.andar();
				} else {
					x.pular();
				}
			}

			System.out.println("\nDeseja continuar? (s/n)");
			sair = sc.next().charAt(0);

		} while (sair != 'n');

		System.out.println("Obrigado!");
		sc.close();
		
		sc2.close();
	}
}