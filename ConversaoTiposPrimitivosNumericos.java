package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1;// aqui houve uma conversão Implícita (1, inteiro(menor), para double(maior))
        System.out.println(a);
        
        //float b = 1.0f;
        //float b = (float)1.0;//cast , conversao explícita 
        
        float b = (float) 1.123456788888;// aqui em determinado momento o float vai ser truncado pois float não suporta esse tipo de valor (perda de informação)
        System.out.println(b);
        
        int c = 4;
        byte d = (byte)c;
        System.out.println(d);
        
        double e = 1.9999;
        
        int f = (int)e;
        System.out.println(f);
        
        // tentar sempre fugir de cast pois corre o risco de perder informação 
        
	}

}
