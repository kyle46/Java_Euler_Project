package Euler2;

public class Euler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		int term1 = 1;
		int term2 = 1;
		while(term1 < 4000000 && term2 < 4000000){
		
			if(term2 % 2 == 0){
				total += term2;
			}
			int temp = term2;
			term2 += term1;
			term1 = temp;
		}
		System.out.print(total);
	}

}
