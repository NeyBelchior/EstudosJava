package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		// forma pos fixada
		a++;
		a--;
		//forma pre fixada
		++b;
		--b;
		
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("mini Desafio ...");
		System.out.println(++a == b--); // o operado ++ prefixado tem mais preferencia do que o pos fixado -- aqui ele calcula o a compara com b e só depois decrementa 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
