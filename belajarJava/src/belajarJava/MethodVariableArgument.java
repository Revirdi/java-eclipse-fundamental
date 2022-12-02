package belajarJava;

public class MethodVariableArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] values = {80, 70, 80, 80};
	sayCongrats("Dwi", values);
	
	// Variabel argument
	sayCongrats("revirdi", 80,80,60,80);
	
	}
	static void sayCongrats(String nama, int... values) {
		var total = 0;
		for(var value: values) {
			total += value;
		};
		
		var finalValue = total / values.length;
		
		if(finalValue >= 75) {
			System.out.println("Selamat "+ nama +" Anda lulus dengan nilai "+ finalValue );
		} else {
			System.out.println("Maaf "+ nama + " Anda tidak lulus dengan nilai "+finalValue);
		}
		
	}

}
