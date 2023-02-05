package Curso_Leonardo_Moura;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000; // variavel wrapper
		System.out.println(num1.toString().length()); // conversão e leitura com wrapper
		
		int num2 = 100000; // tipo primitivo
		System.out.println(Integer.toString(num2).length()); // conversão e leitura com tipo primitivo
		
		System.out.println((" " + num1).length());
		System.out.println((" " + num2).length());

	}

}
