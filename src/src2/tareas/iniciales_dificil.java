package src2.tareas;

import libs.Input;

public class iniciales_dificil {
	

	public static void main(String args[]) {
		String answer = "y";
		do
		{
			System.out.println("What's your name?");
			String Name = Input.get_string();
			
			if (Is_Valid_Name(Name)) {
				System.out.println("Your initials are: " + Get_Initials(Name));
			}else {
				System.out.println("That doesn't look like a valid name.");
			}			
			
			System.out.println("Wanna try again? y / n");
			answer = Input.get_string();
		} while (answer.equals("y"));
	}
	
	public static boolean Is_Valid_Name (String Name) {
		if (!Name.matches("[a-zA-Z ]+")) {
			return false;
		}else {
			return true;
		}		
	}
	
	public static String Get_Initials (String Name) {
		String Initials = "";
		String[] Words;
		
		Words = Name.split(" ");
		
		for (String Word : Words) {
			Word = Word.trim();
			if (!Word.isEmpty()) {
				Initials += Word.charAt(0);				
			}			
		}
		
		return Initials;		
	}
}
	
	