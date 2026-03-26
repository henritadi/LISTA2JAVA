package Lista02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double nota;
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno:");
		nota = receba.nextDouble();
		
		if (nota >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		

	}
}