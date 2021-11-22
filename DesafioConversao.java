package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        	
		
		
		System.out.println("Digite o primeiro salário ");
		String salario = entrada.nextLine();
		System.out.println("Digite o segundo  salário ");
		String salario1 = entrada.nextLine();
		System.out.println("Digite o terceiro salário ");
		String salario2 = entrada.nextLine();
		
		
		Double media=((Double.parseDouble(salario.replace(",", "."))
				+Double.parseDouble(salario2.replace(",", "."))
				+Double.parseDouble(salario.replace(",", ".")))/3);
		
		  System.out.println("A média dos salários é : " + media);
		
		
	   
		
		entrada.close();
	
		

	}

}
