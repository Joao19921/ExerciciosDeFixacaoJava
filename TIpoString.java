package Curso_Leonardo_Moura;

public class TIpoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		s = s.toUpperCase();
		System.out.println(s);
		
		//verifica o valor booleano a partir da string 
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		//Verifica qual valor final da variavel
		System.out.println(s.endsWith("dia"));
		//Verifica a quantidade de espaços na variavel
		System.out.println(s.length());
		//Verifica a igualdade
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		// Declarando variavel sem informar o tipo
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// Forma normal  de como apresentar uma menasagem ao usuario
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		// Forma simplificada de como apresentar uma menasagem ao usuario
		System.out.printf("\nO senhor  %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		//Atribuindo uma frase em uma variavel
		String frase = String.format("\nO senhor  %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		String MaisUmaString = "\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;
		System.out.println(MaisUmaString);
		
		System.out.println("\nFrase qualquer".contains("qual"));
		System.out.println("\nFrase qualquer".indexOf("qual"));
		System.out.println("\n\nFrase qualquer".substring(6));
		System.out.println("\n\nFrase qualquer".substring(6, 9));
	}

}
