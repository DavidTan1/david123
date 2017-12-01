package LionsPuzzle;

public class Recursion {

	public Recursion() {
		// TODO Auto-generated constructor stub
	}
	
	
	 public static void main(String[] args){
		 int value = 2;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2,0)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime, int currentCount) {
			 if(value == 1) {
				return currentCount;
			 }
			 else {
			 	if(value % testPrime == 0) {
			 		return countPrimeFactors(value/testPrime,testPrime,currentCount+1);
			 	}
			 	else {
			 		return countPrimeFactors(value,testPrime+1,currentCount);
			 	}
			 }
		 }

		 public static long factorial(long value) {
			 if(value <= 1)
			 {
				 return 1;
			 }
			 else
			 {
				 
				 return value*factorial(value-1);
			 }			 
		 
		 }

}
