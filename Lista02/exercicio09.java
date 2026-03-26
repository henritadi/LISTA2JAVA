package Lista02;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		double num1, num2;
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		num1 = receba.nextDouble();
		
		System.out.println("Digite o segundo número:");
		num2 = receba.nextDouble();
		
		if (num1 > num2) {
			System.out.println("O maior número é: " + num1);
		} else if (num2 > num1) {
			System.out.println("O maior número é: " + num2);
		} else {
			System.out.println("Os dois números são iguais.");
		}
		
			}
}