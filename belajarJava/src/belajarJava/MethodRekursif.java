package belajarJava;

public class MethodRekursif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(3));
		System.out.println(factorialRekursif(10));

	}
	

	static int factorial(int value) {
		var result = 1;
		
		for(int i = 1; i <= value; i++) {
			result *= i;
		}
		return result;
	}
	static long factorialRekursif(long value) {
		if(value <= 1) {
			return 1;
		}
		return value * factorialRekursif(value-1); 
	}

}
