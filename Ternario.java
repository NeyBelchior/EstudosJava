package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		// nada mais é do que uma atribuição condicional (ternario)
		
		double media = 7.6;
		String resultadoParcial = media >= 5 ? "em recuperação " : "Reprocado";
		String resultadoFinal = media>=7.0 ? 
				"Aprovado" : resultadoParcial;
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia =nota >= 7;
		boolean temDesconto = bomComportamento&&passouPorMedia;
	    String resultado =temDesconto ? "Sim" :  "Não";
		
		System.out.println("tem desconto?" +  resultado);
		System.out.printf("tem Desconto ? %s",resultado);
		
		
		System.out.println("O alundo está " +resultadoFinal);

	}

}
