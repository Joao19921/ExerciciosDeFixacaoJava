package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = input.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!!");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if(media < 4.5) {
			System.out.println("Reprovado");
		}
		input.close();

	}

}
