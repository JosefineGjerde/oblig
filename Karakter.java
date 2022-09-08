package oppgaver;
import static javax.swing.JOptionPane.*;

import java.util.Scanner;

import static java.lang.Integer.*;
public class Karakter {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++)	{
			int poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsum"));
			String karakter = "Ikke godkjent";
			


			
			if(poengsum >= 1 && poengsum <= 39) {
				karakter = "F";
				}
				
			if(poengsum >= 40 && poengsum <= 59) {
				karakter = "E";
				}
				
			if(poengsum >= 60 && poengsum <= 79) {
				karakter = "C";
				}
			
			if(poengsum >= 80 && poengsum <= 89) {
				karakter = "B";
				}
				
			if(poengsum >= 90 && poengsum <= 100) {
				karakter = "A, Gartulerer";
				
				}
				if((karakter).equals("Ikke godkjent"));
					i = i - 1;

					
			showMessageDialog(null,"Du fikk karakteren: " + karakter);
		}
	}
}
