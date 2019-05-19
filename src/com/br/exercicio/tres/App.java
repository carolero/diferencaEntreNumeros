package com.br.exercicio.tres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int controle = 1;
		
		while (controle > 0) {
			
			System.out.println("Digite um numero");
			int primeiroNum = scan.nextInt();
			
			System.out.println("Digite outro: ");
			int segundoNum = scan.nextInt();
			
			if (primeiroNum > segundoNum) {
				
				int diferenca = primeiroNum - segundoNum;
				System.out.println("A diferença entre os dois número é de: " + diferenca);
				
			} else {
				
				int diferenca = segundoNum - primeiroNum;
				System.out.println("A diferença entre os dois número é de: " + diferenca);
				
			}
			
			System.out.println("Digite 1 para continuar no programa ou -1 para sair");
			controle = scan.nextInt();
			
		}
		
	}

}
