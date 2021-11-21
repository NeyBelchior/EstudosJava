package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		//String s ="Texto";
		String s = new String ("texto");
		s.toUpperCase();
		
		//Wrappers;Versão objeto dos tipos primitivos, para cada tipo primito tem um warapper associado 
		int a = 123;// tipo primitivos só carrega os valores 
		System.out.println(a);
		//a. não se tem nenhuma comportamento vinculado a um tipo primitivo 
		
		/**
		 * A diferença entre primitivos X objetos (tudo em java é objeto menos o 8 tipos primitivos que temos )
		 * 
		 * 
		 */
	}

}
