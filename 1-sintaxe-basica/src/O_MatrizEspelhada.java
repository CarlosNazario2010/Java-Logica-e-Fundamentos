
public class O_MatrizEspelhada {
	
	public static void main(String[] args) {
		
		for(int linha = 1; linha <= 7; linha++) {
			int caracA = 1;
			int caracB = 0;

			for(int coluna = 1; coluna <= 7; coluna++) {
				
				if(linha == coluna) {
					System.out.print("   ");
				}
				if(coluna < linha) {
					System.out.print(" " + caracA + " ");
					caracA++;
				}
				if(coluna > linha) {
					caracB = linha;
					System.out.print(" " + caracB + " ");
				}
				caracB++;
			}
			System.out.println();
		}
	}
}
