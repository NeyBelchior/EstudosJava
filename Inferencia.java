package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
	
		double a =4.5;//declaração/inicialização 
		System.out.println(a);
		var b =4.5;
		System.out.println(b);
		
		//a = "....";
		
		var c ="Texto";
		System.out.println(c);
		c= "outro  texto";
		System.out.println(c);
		
		double d;// variável foi declarada
		
		d=123.65;//variável foi inicializada 
		
		System.out.println(d);//variavel foi utilizada
		var e=123.45;
		//var e;// aqui não é possível pois o var infere o tipo na inicialização da variavel
		//e =123.45;
		
		

	}

}
