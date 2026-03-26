package Lista02;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Peça um número");
		num = receba.nextInt();
	
		if (num > 0) {
			System.out.println("O número é positivo");
			
			if (num > 50) {
				System.out.println("E é maior que 50");
			} else {
				System.out.println("Mas não é maior que 50");
			}
			
		} else {
			System.out.println("O número não é positivo");
		}

	}
}