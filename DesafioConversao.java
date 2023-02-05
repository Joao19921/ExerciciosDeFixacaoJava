package Curso_Leonardo_Moura;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Locale;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US","pt-BR"));
		
		//Solicitando os salarios para o calculo 
		String valor3 = JOptionPane.showInputDialog("Digite seu antepenultimo salario: ");
		String valor2 = JOptionPane.showInputDialog("Digite seu penultimo salario");
		String valor1 = JOptionPane.showInputDialog("Digite seu ultimo salario");
		
		//Fazendo a conversão de String para double / Substituindo a vírgula pelo ponto (REPLACE)
		double salario3 = Double.parseDouble(valor3.replace(",", "."));
		double salario2 = Double.parseDouble(valor2.replace(",", "."));
		double salario1 = Double.parseDouble(valor1.replace(",", "."));
		double media = (salario3 + salario2 + salario1)/3;
		System.out.printf("A sua média salarial é : R$%.2f%n",  media);
						
		input.close();
	}

}
