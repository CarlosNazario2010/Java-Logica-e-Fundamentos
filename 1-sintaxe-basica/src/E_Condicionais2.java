
public class E_Condicionais2 {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");	// && condicional E      	  	
		int idade = 16;									// || condicional OU
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas > 1;    // boolean recebe true ou false
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Voce tem mais de 18 anos ou esta acompanhado");
		}
		else {
			System.out.println("Voce tem menos de 18 anos e nao esta acompanhado");
		}
	}
}
