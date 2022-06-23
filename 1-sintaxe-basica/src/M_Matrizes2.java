
public class M_Matrizes2 {

	public static void main(String[] args) {
			
		String cabecalho = "   1  2  3  4  5  6  7  8  9";
		System.out.println(cabecalho);
		
		for(int linha = 1; linha < 10; linha++) {
			System.out.print(linha + " ");
			
			// mesmo codigo do exercicio anterior, sem o comando break
			for(int coluna = 0; coluna < linha; coluna++) {	
				System.out.print(" " + linha + " ");
			}
			System.out.println();
		}
	}
}
