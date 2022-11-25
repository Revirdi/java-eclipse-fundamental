package belajarJava;

public class SwitchLambda {

	public static void main(String[] args) {
	
		var nilai = "Z";
		
		switch (nilai) {
		case "A" -> System.out.println("Sempoerna");
		case "B", "C" -> System.out.println("Selamat anda lulus");
		case "D" -> System.out.println("Coba lagi");
		default -> {
			System.out.println("mending ternak lele");
			System.out.println("xixixi");
		}
		}
		
		var nilai2 = "Z";
		String ucapan = switch (nilai2) {
		case "A":
			yield "Sempoerna";
		case "B", "C":
			yield "Lulus guys";
		case "D":
			yield "Coba lagi";
		default:
			yield "Mending ternak lele";
		};
		
		System.out.println(ucapan);

	}

}
