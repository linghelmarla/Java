package aula1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		/*
		 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva sua idade em anos: ");
		int anos = sc.nextInt();
		System.out.println();
		
		int meses = anos * 12;
		int dias = anos * 365;
		
		System.out.println("Voc� digitou: " + anos);
		System.out.println("Sua idade em meses �: " + meses);
		System.out.println("Sua idade em dias �: " + dias);
		
		
		
		
		
		
		sc.close();

	}

}
