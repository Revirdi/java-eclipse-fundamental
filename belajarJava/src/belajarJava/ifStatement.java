package belajarJava;

public class ifStatement {
	public static void main(String[] args) {
		
		var nilai = 70;
		var absen = 90;
		
		if(nilai >= 75 && absen >= 75) {
			System.out.println("Anda Lulus");
		}
		
		if(nilai >= 75 && absen >= 75) {
			System.out.println("Anda Lulus");
		} else {
			System.out.println("Anda tidak lulus");
		}
		
		if(nilai >= 75 && absen >= 75) {
			System.out.println("Anda Lulus");
		} else if(nilai >= 70 && absen >= 70) {
			System.out.println("Sedikit lagi");
		} else {
			System.out.println("Anda tidak lulus");
		}
		
		// ternary operator
		String ucapan = nilai > 75 ? "Anda lulus":"Sabar ya gan";
		System.out.println(ucapan);
	}

}
