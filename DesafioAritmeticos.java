package ExerciciosDeFixacao;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		System.out.println("Formula:");
		System.out.println("\nPrimeira parte: ([6*(3+2)]*2 ");
		double PrimeiraParte = 6 * (3 + 2);
		PrimeiraParte = Math.pow(PrimeiraParte, 2);
		System.out.printf("%.0f\n", PrimeiraParte = PrimeiraParte / (3 * 2));

		System.out.println("\nSegunda parte: (((1-5)*(2-7))*2)/2 ");
		double SegundaParte = (1 - 5) * (2 - 7) / 2;
		SegundaParte = Math.pow(SegundaParte, 2);
		System.out.printf("%.0f\n", SegundaParte);

		System.out.println("\nTerceiraParte = (PrimeiraParte - SegundaParte)");
		double TerceiraParte = PrimeiraParte - SegundaParte;
		System.out.printf("%.0f%n",TerceiraParte);
		System.out.println("(50 * 3) / (10 * 3)");
		
		double ResultadoFinal = Math.pow(TerceiraParte, 3);
		double CalculoDeBaixo = Math.pow(10, 3);
		System.out.printf("%.0f%n", ResultadoFinal/CalculoDeBaixo);


	   

	}

}
