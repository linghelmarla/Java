package aula1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual sua idade ? : ");
		int anos = sc.nextInt();
		System.out.println();
		
		int meses = anos * 12;
		int dias = anos * 365;
		
				
		System.out.println("Você digitou: " + anos);
		System.out.println("Sua idade em meses é: " + meses);
		System.out.println("Sua idade em anos é: " + anos);
		System.out.println("Sua idade em dias é: " + dias);

	}

}
