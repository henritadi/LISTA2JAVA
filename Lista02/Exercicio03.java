package Lista02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Diga um número");
		num = receba.nextInt();
		
		if(num<100) {
			System.out.println("O numero que voçe digitou é menor que 100");
		}else {
			System.out.println("seu numero é maior que 100");
		}
		
		}
	}
