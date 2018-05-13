package src2.tareas;

import libs.Input;

public class Cifrado_Cesar {
	

	public static void main(String args[]) {
		String answer = "y";
		do
		{
			System.out.println("So you wanna cript something. Tell me what: ");
			String ToCrypt = Input.get_string();
			
			if (!ToCrypt.matches("[a-zA-Z ]+")) {
				System.out.println("Sorry I just accept letters at the moment");
				continue;
			}
			
			System.out.println("Now tell me your key, remember it should be between 1 and 26: ");			
			int Key = Input.get_int();
			
			if (Key >= 1 && Key <= 26) {
				System.out.println("Here you go: " + CryptString (ToCrypt, Key));
			}else {
				System.out.println("Sorry, you're not playing fare.");
				continue;
			}
			
			System.out.println("Wanna try again? y / n");
			answer = Input.get_string();
		} while (answer.equals("y"));
	}
	
	public static String CryptString (String str, int Key) {
		String Crypted = "";
		char individualc ;
		int CharCrypted;
		str = str.toUpperCase();
		
		for (int i=0; i<=(str.length()-1); i++) {
			individualc = str.charAt(i);
			if (individualc == 32) {
				Crypted += (char) individualc;
				continue;
			}				
			
			CharCrypted = individualc + Key;			
			
			if (CharCrypted > 90) {
				CharCrypted = CharCrypted - 26;
			}
			Crypted += (char) (CharCrypted); 
		}		
		return Crypted;
	}
}