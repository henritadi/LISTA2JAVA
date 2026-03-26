package Lista02;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número:");
		num = receba.nextInt();
	
		if (num < 0) {
			System.out.println("Negativo");
		} else if (num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positivo");
		}

	}

}
