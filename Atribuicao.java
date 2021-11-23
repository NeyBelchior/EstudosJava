package fundamentos;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a+b;
		System.out.println(a);
		
		c+=b; // c = c+b
		System.out.println(c);
		c-=a; //c = c-a
		System.out.println(c);
		c*=b; // c=c*b
		System.out.println(c);
		c/=a; // c=c/a
		
		System.out.println(c);
		c%=2; // c=c%2 vai dar 0 (par) ou 1 (impar)
		
		System.out.println(c);
		

	}

}
