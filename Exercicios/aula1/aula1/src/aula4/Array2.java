package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/  
		
		Scanner sc = new Scanner(System.in);
		int pares=0, impares=0, somaPares=0, somaImpares=0, num, cont=1;
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("Digite o %dº número: ", cont++);
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
		
		System.out.printf("\nNúmeros pares digitados: %d%n", pares);
		System.out.println("Os números pares são: " + par);
		System.out.printf("Soma de números pares: %d%n",somaPares);
		System.out.printf("Números impares digitados: %d%n", impares);
		System.out.println("Os números impares são: " + impar);
		System.out.printf("Soma de números impares: %d%n",somaImpares);
		
		
		sc.close();

	}

}
