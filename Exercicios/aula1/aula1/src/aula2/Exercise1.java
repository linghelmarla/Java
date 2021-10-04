package aula2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/ 
 
		Scanner sc = new Scanner (System.in);
		System.out.print("\nqual sua nota no primeiro bimestre ? :");
		int N1 = sc.nextInt();
		System.out.print("\nqual sua nota no segundo bimestre ? :");
		int N2 = sc.nextInt();
		System.out.print("\nqual sua nota no terceiro bimestre ? :");
		int N3 = sc.nextInt();
		
		if(N1>N2 && N1>N3) {
			System.out.printf("\nA Maior Nota é : %d",N1);
		}
		else if (N2>N1 && N2>N3) {
			System.out.printf("\nA Maior Nota é : %d",N2);
		} else if(N1==N2 || N1==N3 ) {
			System.out.printf("\nA Maior Nota é : %d",N1);
		}else if(N2==N3 ) {
			System.out.printf("\nA Maior Nota é : %d",N2);
		}
		else {
			System.out.printf("\nA Maior Nota é : %d",N3);
		}
		
		sc.close();
	}

}
