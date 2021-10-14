package asciiartproject1;
// Rocket Ship printed out using ASCII symbols

public class asciiartproject1 {
	public static final int MIDDLE = 32; //exact middle line of the ship
	public static final int HEIGHT = 30;
	public static void main(String[] args) {
		verytop(5); //pointy part of rocket ship (length controllable)
		shiptop(4,15); //crew or cargo bay atop the rocket shaft (size controllable)
		middle(); 	//the shaft of the rocket
		thruster(); //thruster of rocket
		exhaust(1); //smoke/burning oxygen coming out of thruster (amount of exhaust controllable)
	}
	public static void verytop(int length) {
		for (int spire = 1; spire<=length; spire++) {
			for (int spaces = 1; spaces<= MIDDLE-2; spaces++) {
				System.out.print(" ");
			}
			System.out.println("</|\\>");
		}
	}

	public static void shiptop(int number, int amount) {
		for (int j = 1; j<= amount; j++) {
			for (int space = 1; space <= 20-(j-10); space++) {
				System.out.print(" ");
			}
			System.out.print("<(");
			for (int i = 1; i <= j*number/2 +1; i++) {
				System.out.print("=");
			}System.out.println(")>");
		}
	}
	
	public static void middle() { // rocket shaft
		for(int i = 1; i<= HEIGHT; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.print(" ");		
			}
			System.out.print("||\\\\");
			for (int k = 1; k <= 9; k++) {
				System.out.print(" + ");
			}
			System.out.print("//||");
			System.out.println();
		}
	}
	public static void thruster() { //bottom of rocket
		for(int i = 1;i<=14;i++) {
			System.out.print(" ");
		}
		System.out.println("/ | /___________________________\\ | \\");
		for(int i = 1;i<=14;i++) {
			System.out.print(" ");
		}
		System.out.println("\\ | \\,,,,,,,,,,,,,,,,,,,,,,,,,,,/ | /");
		int f = 0; 
		
		for(int a = 19; a<=23; a++) { //number of layers - 4
			f = f+2;
			for(int b = 1; b<=a;b++) {
				System.out.print(" ");//controls spacing before the left side of thruster
			}
			System.out.print("\\");
			for(int c = 1; c<= 27-f; c++) { //prints spacing between sides of thruster
				System.out.print(" ");
			}
			System.out.println("/");
		}
		for(int i=1;i<=23;i++) {
			System.out.print(" ");
		}
		System.out.println("[|||||||||||||||||]");
	}
	public static void exhaust(int exhaustamt) { //parameter controls amount of exhaust coming out of exhaust pipe
		for (int a = 1; a <= exhaustamt; a++) {
			for (int i = 1; i <= 10; i++) {
				for (int j = 5; j >= i; j--) {
					for (int k = 35; k > j; k--) {
						System.out.print(" ");
					}
					System.out.print("////");
					System.out.println();
				}				
			}
			
		}
	}

}
