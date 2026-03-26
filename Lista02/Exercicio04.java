package Lista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int idade;
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = receba.nextInt();
		if (idade <=60) {
		System.out.println("Tu tem menos de 60 anos");
	
		}else {
			System.out.println("Se tem mais de 60 anos");
	
	}
	}
}


