
public class N_Fatorial {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 1; i < 10; i++) {
			soma += i;
			System.out.print("O fatorial de " + i + " = ");
			
			for(int j = 1; j <= i; j++) {
				if(j == i) {
					System.out.print(j + " = ");		
				}
				else {
					System.out.print(j + " + ");		
				}
			}
			System.out.println(soma);
		}
	}
}
