package aula2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/ 
 
		Scanner sc = new Scanner (System.in);
		System.out.print("\nqual sua nota no primeiro bimestre ? :");
		int N1 = sc.nextInt();
		System.out.print("\nqual sua nota no segundo bimestre ? :");
		int N2 = sc.nextInt();
		System.out.print("\nqual sua nota no terceiro bimestre ? :");
		int N3 = sc.nextInt();
		
		if(N1>N2 && N1>N3) {
			System.out.printf("\nA Maior Nota � : %d",N1);
		}
		else if (N2>N1 && N2>N3) {
			System.out.printf("\nA Maior Nota � : %d",N2);
		} else if(N1==N2 || N1==N3 ) {
			System.out.printf("\nA Maior Nota � : %d",N1);
		}else if(N2==N3 ) {
			System.out.printf("\nA Maior Nota � : %d",N2);
		}
		else {
			System.out.printf("\nA Maior Nota � : %d",N3);
		}
		
		sc.close();
	}

}
