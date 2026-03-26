package Lista02;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("fala tua idade");
		num = receba.nextInt();
	
		if (num > 18) {
			System.out.println("tu é maior de idade");
			
			if (num > 60) {
				System.out.println("E tu é tem mais de 60");
			} else {
				System.out.println("Mas não tem menos que 60");
			}
			
		} else {
			System.out.println("tu não é maior de idade");
		}

	}
}