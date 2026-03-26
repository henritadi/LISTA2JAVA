package Lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		
		
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = receba.nextInt();
		if(idade >=18) {
		System.out.println("Tu é maior de idade");
		
		} else {
			System.out.println("Tu é menor de idade");
		}
	}
}