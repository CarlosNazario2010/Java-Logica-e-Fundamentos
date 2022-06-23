
public class L_Matrizes {

	public static void main(String[] args) {
		
		String cabecalho = "   1  2  3  4  5  6  7  8  9";
		System.out.println(cabecalho);
		
		for(int linha = 1; linha < 10; linha++) {
			
			System.out.print(linha + " ");
			
			for(int coluna = 1; coluna < 10; coluna++) {
				
				if(coluna > linha) {
					break;     				// break sai do laco mais interno
				}
				else {
					System.out.print(" " + linha + " ");
				}
			}
			System.out.println();
		}
	}
}
