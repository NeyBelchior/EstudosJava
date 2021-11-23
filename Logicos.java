package fundamentos;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		
		
		
		System.out.println("tabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
	//	System.out.println(false && true); codigo morto
	//	System.out.println(false && false);
		
		System.out.println("tabela verdade OU");
	//	System.out.println(true || true);
	///	System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("tabela verdade OU exclusivo xor");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^  false);
		
		System.out.println("tabela verdade not (unário)<<<");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
		
	}

}
