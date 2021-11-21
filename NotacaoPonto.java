package fundamentos;



public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a =2.3;
		String s ="Bom dia X";
		s.toUpperCase();
		System.out.println(s);
		/* essa função não altera o valor original, ela simplesmente pega o valor
		 * que eu atribui nessa string e converte para maiuscula apenas na linha 
		 */
		s=s.toUpperCase();//aqui eu armazeno o valor da função
		System.out.println(s);
		s.replace("X", "senhora");
		System.out.println(s);
		s=s.replace("X","senhora");
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
		s.concat("!!!!!");
		System.out.println(s);
		s=s.concat("!!!!!");
		System.out.println(s);
		
		System.out.println("leo".toUpperCase());
		
		String x = "leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				//.length()
				.toUpperCase()//não existe dentro dos interios
				.concat("!!!!!");
		System.out.println(y);
		
		//tipos prmitivos não tem o operador .
		
		int b =3;// unica coisa que o tipo primitivo armazena é o valor
		//você não pode ter comportamentos e atributos associados a tipos primitivos 
		// você usa a notação . com tudo menos com os tipos primitivos 
		
		
		
		
	}

}
