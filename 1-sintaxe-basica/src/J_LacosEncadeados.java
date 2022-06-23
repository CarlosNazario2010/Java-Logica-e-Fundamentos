
public class J_LacosEncadeados {

	public static void main(String[] args) {
		
		for(int mult = 1; mult < 10; mult++) {
			
			for(int num = 1; num <= 10; num++) {
				
				System.out.print(num + " X " + mult + " = " + mult * num + ",  ");
			}
			System.out.println();
		}
	}
}
