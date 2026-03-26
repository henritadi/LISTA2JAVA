package Lista02;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("fala tua idade");
		num = receba.nextInt();
	
		if (num > 18) {
			System.out.println("tu é maior de idade");
			
			if (num > 60) {
				System.out.println("E tu tem mais de 65 anos pode se Aposentar");
			} else {
				System.out.println("Mas não tem menos que 65 não pode se aposentar");
			}
			
		} else {
			System.out.println("tu não é maior de idade");
		}

	}
}