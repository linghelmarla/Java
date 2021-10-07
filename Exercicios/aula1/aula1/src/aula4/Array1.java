package aula4;

public class Array1 {

	public static void main(String[] args) {
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/ 

		int[] A= { 1, 0, 5, -2, -5, 7};
		int soma;
		int x;
		
//SOMA DOS VETORES 0,1,5
		soma=(A[0]+A[1]+A[5]);
		System.out.printf("A soma de A[0],A[1],A[5] é de: %d\n\n\n\n",soma);
//SUBSTITUIÇÃO DO VALOR DO VETOR 3
		A[3]=100;
//IMPRIMINDO OS VALORES ATUAIS DO VETOR
		System.out.printf("Os valores do vetor são: ");
		for (x=0;x<6;x++){
		System.out.printf("%d\t", A[x]);
		}
	}

				
	}


