
public class F_EscopoDeVariaveis {
	
	public static void main(String[] args) {
			
		System.out.println("Testando Condicionais");
		int idade = 16;									
		int quantidadePessoas = 1;
		boolean acompanhado;      		// variavel precisa ser declarada para ser utilizado nos if/else
		
		//boolean acompanhado = quantidadePessoas > 1;  
		if (quantidadePessoas > 1) {
			acompanhado = true;         // a variavel acompanhado nasce e morre entre as chaves
		}                               // este é seu escopo
		else {
			acompanhado = false; 		// por isso deve ser declarado fora do escopo dos if/else
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Voce tem mais de 18 anos ou esta acompanhado");
		}
		else {
			System.out.println("Voce tem menos de 18 anos e nao esta acompanhado");
		}
	}
}

