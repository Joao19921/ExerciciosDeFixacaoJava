package Curso_Leonardo_Moura;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.toUpperCase();
		System.out.println(s);
		s = s.replace("X", "Senhora");
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		// Ou
		String x  = "Leo".toUpperCase()	;
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		
	}

}
