package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Studente[] students = new Studente[20];
		
		Random rnd = new Random();
		
		for (int i = 0; i < 20; i++) {
			
			Studente s = new Studente(i + 1, rnd.nextInt(101), rnd.nextFloat(5));
			
			students[i] = s;			
		}
		
		int promossiC = 0;
		
		for (int i = 0; i < students.length; i++) {
			
			Studente s = students[i];
			
			System.out.println(s);
			
			if (!s.isBocciato()) {
				promossiC++;
			}			
		}
		
		System.out.println("\n ---------------------- \n");
		System.out.println("Studenti promossi: " + promossiC);
	}
}
