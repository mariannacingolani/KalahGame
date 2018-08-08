package com.marianna;
import java.util.Scanner; 

public class Kalah {

	private static Scanner scan;

	public static void main(String[] args) {
		try { 
			int a = 10;
			int b = 50;
			int c = a+b;
			System.out.println(c);
			boolean d = a>b;
			System.out.println(d);
			System.out.print("Inserisci la tua età: \n");
			scan = new Scanner(System.in);
			int inputUtente = scan.nextInt(); //scan è un oggetto istanziato da Scanner e nextInt è un metodo
			
			//Camel case iniziale maiuscola => classi 
			//Camel case iniziale minuscola => proprietà, metodi, variabili, oggetti
			//in altri linguaggi Snake case => variabile_brutta
			//Kebab case => variabile-brutta
			
			System.out.println(inputUtente);
			
			if(inputUtente > 65) {
				System.out.println("Bravo, ti becchi la pensione");
			} else if (inputUtente < 18) {
				System.out.println("No");
			} else {
				System.out.println("Riprova l'anno prossimo");
			}
			
			
			switch(a) {
				case 12:
					System.out.println("No");
					break;
				case 30:
					System.out.println("si");
					break;
				default:
					System.out.println("sni");
			}
		}
		catch(Exception err) {
			String errore = err.getMessage();
			System.out.println(errore);
		}
		
		
		

	}

}
