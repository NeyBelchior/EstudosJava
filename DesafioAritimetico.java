package fundamentos;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 3;
		int c = 2;
		int d = 1;
		int e = 5;
		int f = 7;
		int conta1=a*(b+c);
		int primeiraSentenca= (int)Math.pow(conta1, 2)/(b*c);
		int conta2 =(d-e)*(c-f)/2;
		int segundaSentenca = (int)Math.pow(conta2, 2);
		int terceiraSentenca = (primeiraSentenca)-(segundaSentenca);
		int expresaoFinal = (int)Math.pow(terceiraSentenca,3)/(int)Math.pow(10, 3);
		
		
		System.out.println(conta1);
		System.out.println(primeiraSentenca);
		System.out.println(conta2);
		System.out.println(segundaSentenca);
		System.out.println(terceiraSentenca);
		System.out.println(expresaoFinal);
		
		
		

	}

}
