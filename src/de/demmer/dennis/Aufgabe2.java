package de.demmer.dennis;

public class Aufgabe2 {
	
	// Schreibt eine Methode die einen int als parameter nimmt und diesen dann als double zurückgibt.
	// bsp.: 5 wird an die Methode übergeben -> 5.0 als double wert kommt über den Rückgabewert raus

	// Warum ist das umgekehrt nicht so einfach möglich?
	
	
	static double toDouble(int i) {
		double d = i;
		
		return d; 
		
	}
	


	public static void main(String[] args) {
		
		int i = 12314;
		double d =  toDouble(i);
		
		System.out.println(d);
		
	}
	
	
	
	

}
