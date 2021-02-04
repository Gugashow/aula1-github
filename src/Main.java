import java.util.Locale;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int continuar;
		do {

			System.out.println("Voce deseja qual opera��o? \n\n 1. Adi��o \n 2. Subtra��o \n 3. Multiplica��o "
					+ "\n 4. Divis�o \n");
			int op = sc.nextInt();

			printConfirm(op);

			System.out.println("Digite o n�mero da tabuada: ");
			int numb = sc.nextInt();

			switch (op) {
			case 1:
				// TABUADA D� ADI��O
				break;

			case 2:
				// TABUADA D� DIVIS�O
				subtracao(numb);
				break;

			case 3:
				// TABUADA D� MULTIPLICA��O
				multiplicacao(numb);
				break;

			case 4:
				// TABUADA D� DIVIS�O
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
			System.out.println("\n** ESCOLHA UMA OPERA��O ** \n\n 1. Adi��o \n 2. Subtra��o \n 3. Multiplica��o "
					+ "\n 4. Divis�o \n\nPRESS '0 (zero)' PARA SAIR");
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
