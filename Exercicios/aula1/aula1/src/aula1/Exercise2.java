package aula1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual sua idade ? : ");
		int anos = sc.nextInt();
		System.out.println();
		
		int meses = anos * 12;
		int dias = anos * 365;
		
				
		System.out.println("Voc� digitou: " + anos);
		System.out.println("Sua idade em meses �: " + meses);
		System.out.println("Sua idade em anos �: " + anos);
		System.out.println("Sua idade em dias �: " + dias);

	}

}
