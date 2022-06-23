
public class H_UsandoWhile {

	public static void main(String[] args) {
		
		int contador = 0;
		int soma = 0;
		
		while (contador < 10) {
			contador++;
			soma += contador;
			
			System.out.println("numero = " + contador + " , somatoria parcial = " + soma);
		}
	}
}
