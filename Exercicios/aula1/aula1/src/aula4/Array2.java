package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/  
		
		Scanner sc = new Scanner(System.in);
		int pares=0, impares=0, somaPares=0, somaImpares=0, num, cont=1;
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("Digite o %d� n�mero: ", cont++);
			num = sc.nextInt();
			if((num % 2) == 0) {
				par.add(num);
				pares++;
				somaPares = num + pares;
			}else {
				impar.add(num);
				impares++;
				somaImpares = num + impares;
			}
		}
		
		System.out.printf("\nN�meros pares digitados: %d%n", pares);
		System.out.println("Os n�meros pares s�o: " + par);
		System.out.printf("Soma de n�meros pares: %d%n",somaPares);
		System.out.printf("N�meros impares digitados: %d%n", impares);
		System.out.println("Os n�meros impares s�o: " + impar);
		System.out.printf("Soma de n�meros impares: %d%n",somaImpares);
		
		
		sc.close();

	}

}
