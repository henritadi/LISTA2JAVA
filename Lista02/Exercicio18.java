package Lista02;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número");
		num1 = receba.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = receba.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior");
		} else if (num2 > num1) {
			System.out.println("O segundo número é maior");
		} else {
			System.out.println("Os dois números são iguais");
		}
	}
}