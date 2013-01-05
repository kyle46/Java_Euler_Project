package euler3;

import java.math.BigInteger;

public class Euler3 {

	
	static boolean isPrime(long num){
		for(int i = 2; i <= Math.sqrt((num)); ++i){
					if( num % i == 0 )
						return false;
		}
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		boolean done=false;
		long largest = 2;
		primes obj = new primes();
		while(!done){
			if(num % largest == 0){
				num /= largest;
				if(isPrime(num))
					done = true;
			}
			obj.calculateNextPrime();
			largest = obj.getcurrentPrime();
		}
		System.out.print(num);
	}

	
}
class primes{
	long currentPrime;
	primes(){
		currentPrime = 2;
	}
	
	void calculateNextPrime(){
		while(true){
			currentPrime++;
			if(Euler3.isPrime(currentPrime)){
				return;
			}
		}
	}
	
	long getcurrentPrime(){ return currentPrime; }
}