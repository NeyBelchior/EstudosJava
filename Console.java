package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		System.out.print("Bom");
		System.out.print("Dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		System.out.printf("Megasena: %d %d %d %d %d %d %n",1,2,3,4,5,6);
	     
		System.out.printf("Salário: %.1f%n" ,1234.5678);
		System.out.printf("Nome: %s%n" ,"João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite seu nome : ");
		String nome = entrada.nextLine();
		System.out.printf("Digite seu Sobrenome : ");
		String sobreNome = entrada.nextLine();
		System.out.printf("Digite a sua idade : ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("%s %s tem %d anos.%n",nome,sobreNome,idade);
		
		entrada.close();
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
