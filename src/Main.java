import java.util.Locale;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int continuar;
		do {

			System.out.println("Voce deseja qual operação? \n\n 1. Adição \n 2. Subtração \n 3. Multiplicação "
					+ "\n 4. Divisão \n");
			int op = sc.nextInt();

			printConfirm(op);

			System.out.println("Digite o número da tabuada: ");
			int numb = sc.nextInt();

			switch (op) {
			case 1:
				// TABUADA DÁ ADIÇÃO
				break;

			case 2:
				// TABUADA DÁ DIVISÃO
				subtracao(numb);
				break;

			case 3:
				// TABUADA DÁ MULTIPLICAÇÃO
				multiplicacao(numb);
				break;

			case 4:
				// TABUADA DÁ DIVISÃO
				divisao(numb);
				break;

			default:
				break;
			}

			System.out.println("\nDeseja continuar? PRESS '0 (zero)' PARA SAIR");
			continuar = sc.nextInt();

		} while (continuar != 0);

		System.out.println("Obrigado!");
	}

	private static void printConfirm(int op) {
		Scanner sc = new Scanner(System.in);

		while (op != 1 && op != 2 && op != 3 && op != 4) {
			System.out.println("\n** ESCOLHA UMA OPERAÇÃO ** \n\n 1. Adição \n 2. Subtração \n 3. Multiplicação "
					+ "\n 4. Divisão \n\nPRESS '0 (zero)' PARA SAIR");
			op = sc.nextInt();

			if (op == 0) {
				System.exit(0);
			}
		}
	}

	public static void multiplicacao(int numb) {
		for (int i = 1; i <= 10; i++) {
			int x = numb * i;
			System.out.println(numb + " * " + i + " = " + x);
		}
	}

	public static void subtracao(int numb) {
		for (int i = 1; i <= 10; i++) {
			int x = numb - i;
			System.out.println(numb + " - " + i + " = " + x);
		}
	}

	public static void divisao(int numb) {
		int aux = numb;

		for (int i = 1; i <= 10; i++) {
			int x = numb / aux;
			System.out.println(numb + " / " + aux + " = " + x);
			numb += aux;
		}
	}
}
