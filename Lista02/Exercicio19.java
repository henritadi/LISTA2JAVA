package Lista02;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("digite sua nota");
		num=receba.nextInt();
	
		if (num > 7) {
			System.out.println("Aprovado");
		} if (num > 9) {
			System.out.println("Sua nota é Excelente");
		}else if( num >= 5 && num <=6 ) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}

	}

}
