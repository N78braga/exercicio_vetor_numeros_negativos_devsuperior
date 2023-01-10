package com.teste.vetor.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class ProgemaTesteVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas posição tera o vetor: ");
		int qtd = sc.nextInt();
		
		int[] num = new int[qtd];
		int negativo = 0;
		int maior = 0;
		
		for(int i = 0; i < num.length; i++) {
			sc.nextLine();
			System.out.print("Digite o valor: ");
			num[i] = sc.nextInt();
			
		}
		System.out.println("");
		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i =0 ; i <num.length; i++ ) {
			if( num[i] < 0) {
				negativo = num[i];
				System.out.println(negativo);
			}
			
			if(num[i] < maior) {
				maior = negativo;
			}
			
		}
		System.out.println("O maior valor entre os valores negativo é: " + maior);
	

	}

}
