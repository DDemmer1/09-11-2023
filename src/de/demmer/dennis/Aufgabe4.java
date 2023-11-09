package de.demmer.dennis;

import java.io.File;

public class Aufgabe4 {


	// Überlegt euch für folgende fiktive Szenarien Methoden, die nur einen
	// Rückgabewert und eine Parameterliste haben.
	


	// Bsp.: Schreibt eine "Pseudo"-Methode die eine SMS an eine Telefonnummer verschickt.
	// Die Methode soll zurückgeben ob die SMS erfolgreich versendet wurde.

	// Lösung:

	static boolean sendSMS(long telefonnummer, String nachricht) {
		//...
		
		
		//hier könnte eingetragen werden ob die Nachricht erfolgreich verschickt wurde
		boolean status = true;
		return status;
	}
	
	
	
	
	
	
	//1. Schreibt eine "Pseudo"-Methode die den Pfad einer Datei entgegen nimmt und die Größe dieser Datei zurückgibt
	
	static long getFileSize(String path) {
	
		//[...]  berechnung der Dateigröße [...]
		
		long irgendeineBerechneteGröße = 12345L;
		
		return irgendeineBerechneteGröße;
	}
	
	
	//2. Schreibt eine "Pseudo"-Methode die eine Zeitspanne die in Sekunden angegeben wird, in das Format "hh:mm:ss" umwandelt

//	00:01:15
	
	static String secToDate(int time) {
		
		// [...] umwandlung von sekunden in zeitformat
		
		return "00:01:15";
	}
	
	
	
	public static void main(String[] args) {

		long size = getFileSize("C:\\Users\\Unknown\\git\\09-11-2023\\file\\test.txt");	
		System.out.println(size);
		
		
		
		System.out.println(0 + ":"+ 55 + ":" + 10);
		
		
	}

	

}
