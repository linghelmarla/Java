package aplicacao;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		 * contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não
		 * estiver.
		 */

		int inicio = 233;
		do {
			if (inicio >= 233 && inicio <= 300) {
				inicio++;
				System.out.println("contagem : " + inicio + "\n");
			}
			else if (inicio > 300 && inicio < 400) {
				inicio += 3;
				System.out.println("contagem : " + inicio + "\n");
			} else {
				inicio += 5;
				if (inicio >= 456) {
					inicio = 456;
					System.out.println("contagem : " + inicio + "\n");
					break;
				}
			}
		} while (inicio <= 456);
	}

}
