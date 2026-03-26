package Lista02;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite sua nota");
		num1 = receba.nextInt();
		
		System.out.println("Digite sua frequencia");
		num2 = receba.nextInt();
		
		if (num1 > 6) {
			System.out.println("aluno aprovado");
		} else if (num2 > 75) {
			System.out.println("Sua frequencia é maior que 75");
		} else {
			System.out.println("aluno reprovado");
			if (num2 > 75);
			System.out.println("e sua frequencia é boa");
		}
	}
}