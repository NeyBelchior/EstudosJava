package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		
		String s ="Boa tarde";// É um objeto imutável o que siguinifica
		//que você nunca vai conseguir modificar o valor inicial que você de deu a uma string
		//s=s.toUpperCase() // Eu não estou modificando o valor original eu estou substiuindo 
		//s ="Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		
		var nome = "Pedro";
		
		var sobrenome ="Santos";
		var idade = 33;
		var salario =12345.987;
		
		System.out.println("Nome : "+nome+"\nSobrenome: " 
		+ sobrenome + "\nIdade: "  + idade +"\nSlaraio : "+ salario);
		
		System.out.printf("O senhor  %s %s tem %d e ganha R$%.2f", nome,sobrenome,idade,salario);
         /* %s Strings
          * %d valores inteiros
          * %f valores pontos flutuantes .casas decimais
          */
		String frase = String.format("O senhor  %s %s tem %d e ganha R$%.2f", nome,sobrenome,idade,salario);				
		String maisUmaFrase = "Nome : "+nome+"\nSobrenome: " 
				+ sobrenome + "\nIdade: "  + idade +"\nSlaraio : "+ salario;
		System.out.println(frase);	
		System.out.println(maisUmaFrase);
		
		System.out.println("frase qualquer".contains("qual"));
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6,8));
		
	}

}
