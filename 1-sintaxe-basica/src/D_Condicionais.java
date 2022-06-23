
public class D_Condicionais {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos.");
		}
		else {
			if (quantidadePessoas > 1) {
				System.out.println("Voce tem menos de 18 anos, mas esta acompanhado");
			}
			else {
				System.out.println("Voce tem menos de 18 anos e nao esta acompanhado");
			}
		}
	}
}
