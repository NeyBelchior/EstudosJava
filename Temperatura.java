package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(f - 32 ) * 5/9 = c  5/9 da dizima mas o java poem como 0 pois a dizima não é inteiro
        //f =(c +32)/5/9
		double f=0;
		final double ajuste = 32;
		final double multiplicador = 5.0/9.0;
		double temp=(f-ajuste)*multiplicador;
		
		f=86;
		
		
		System.out.println("O resultado é : "+temp+"c");
		
		f=0;
		temp=(f-ajuste)*multiplicador;
				
		
		System.out.println("O resultado é : "+temp+"c");
		
		
		
		
	
		
		
	}

}
