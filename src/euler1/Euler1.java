package euler1;

public class Euler1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.print("Hello World");
		int total = 0;
		for(int i=0; i< 1000; ++i){
			if(i %3 == 0 || i % 5 == 0){
				total += i;
			}
		}
		System.out.print(total);
	}

}
