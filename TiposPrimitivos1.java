package fundamentos;

public class TiposPrimitivos1 {
	public static void main(String[] args) {
		
		//informações do funcionário
		
		//tipos númericos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//long pontosAcumulados = 3_234_845_223 passou do range do literal inteiro;
		//Quando você definir um literal e o range passa da capcidade do inteiro você obrigatoriamente vai precisarr colocar l
		long pontosAcumulados = 3_234_845_223L;
		//como não passou ele já converteu de inteiro para long
		
		
		//Tipos númericos reais ( com pontos flutuantes)
		
		float salario =11_445.44F; 
		// Qualquer número com ponto flutante é do tipo double, double é o dobro de float
		//Siguinifica que você não vai conseguir colocar um double dentro de um float
		//Nesse caso como eu quero colocar um literal dentro do float obrigatoriamente eu tenho que colocar a letra f no final
	
		//Isso indica para o java que eu estou escrevendo um LITERAL FLOAT  e não double (valor padrão)
	    //O java não analisa o valor (0.00),por exemplo cabe dentro do float mas o java olha o literal que é double para flutuantes (reais))
		double vendasAcumuladas=2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; //true , não permite colocar 0, só true ou false
		//tipo caracter
		char status = 'A';//Só aceita 1 caracter
		char statuss = '\u0010'; //aqui pode pois representa um valor na tabela unicode e vai retorno 1 valor
		//dias de empresa
		System.out.println(anosDeEmpresa*365);
		// A advertência á pq as variáveis não foram utilizadas
		//Números de viagens
		System.out.println(numeroDeVoos/2);
		// Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + "ganha --> " + salario);
		System.out.println("ferias:?"+estaDeFerias);
		System.out.println("status:"+status);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
