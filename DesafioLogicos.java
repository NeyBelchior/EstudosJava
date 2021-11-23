package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32= trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel =!comprouSorvete; //operador unario
		
		System.out.println("Comprou tv de 50\"? " + comprouTV50);
		System.out.println("Comprou tv de 32\"? " + comprouTV32);
		System.out.println("Comprou tv de 32\"Sorvete ? " + comprouSorvete);
		
		System.out.println("Mais saudável? " + maisSaudavel);
		
		
		
		
		

		

		
		
	}

}
