package aula3;

public class Exercise2 {

	public static void main(String[] args) {
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		 */

		int numero = 0;
		for (int i=1;i<11;i++) {
			numero = numero+1;
			if((numero%2)== 0) {
				System.out.printf("numero par %d%n",numero);
				
			} else {
				System.out.printf("numero impar %d%n",numero);
				
			}
		}
	}

}
