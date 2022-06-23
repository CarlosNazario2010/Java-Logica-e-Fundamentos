
public class B_VariaveisNumericas {

	public static void main(String[] args) {
		System.out.println("Ola, novo teste");	// o ln quebra a linha apos o print
		
		int idade = 37;    						// int declara uma variavel do tipo inteiro
		
		System.out.println("A idade é: " + idade + " anos");	// o + é o caracter de concatenacao    

		double salario = 1270.50;				// double declara uma variavel com casa decimal
		
		System.out.println("O salario é: " + salario + " reais");
		
		int salarioInteiro = (int) salario;    	// (int) converte de decimal para inteiro
		
		System.out.println("O salario convertido de decimal para inteiro: " + salarioInteiro);
		
		float numeroDePontoFlutuante = (float) 3.14; // numero de ponto flutuante
		long numeroGrande = 1234567891123L;	  		 // numero ate 64 bits. Leva um caractere L no final
		int numeroPadrao = 123456789;         		 // numero ate 32 bits
		short numeroPequeno = 21311;   	      		 // numero ate 16 bits
		byte numeroByte = 127;           	  		 // numero ate 1 byte, ou seja ate o 127
		
		System.out.println(numeroDePontoFlutuante);
		System.out.println(numeroGrande);
		System.out.println(numeroPadrao);
		System.out.println(numeroPequeno);
		System.out.println(numeroByte);
		
		/* TIPO	TAMANHO
			boolean	1 bit
			byte	1 byte
			short	2 bytes
			char	2 bytes
			int		4 bytes
			float	4 bytes
			long	8 bytes
			double	8 bytes */

	}

}
