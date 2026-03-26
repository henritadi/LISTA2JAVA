package Lista02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		System.out.println("Informe um numero");
		num= receba.nextInt();
		if (num % 2 == 0) {
			System.out.println("Seu numero é par");
		}else { 
			System.out.println("seu numero é impar");
		}

	}

}
