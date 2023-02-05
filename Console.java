package Curso_Leonardo_Moura;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		System.out.println("BOm");
		System.out.println("dia!");

		// String formatada
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);

		System.out.printf("Nome: %s%n", "João");

		Scanner input = new Scanner(System.in);

		System.out.print("\nDigite o seu nome: ");
		String nome = input.nextLine();

		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome = input.nextLine();

		System.out.print("\nDigite a sua idade: ");
		int idade = input.nextInt();

		System.out.printf("%s %s tem %d anos.%n" , nome, sobrenome, idade);
		input.close();
		
	}

}
