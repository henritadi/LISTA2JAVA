package Lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int num;
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite um numero");
		num = receba.nextInt();
		if (num >= 0) {
			System.out.println("teu numero é positivo");
		} else {
			System.out.println("teu numero é negativo");
		}

	}
}
