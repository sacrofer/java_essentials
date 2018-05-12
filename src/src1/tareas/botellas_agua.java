package src1.tareas;

import libs.Input;

public class botellas_agua {
	static int bottles = 12;

	public static void main(String args[]) {
		String answer = "y";
		do
		{
			System.out.println("Hello there! "
					+ "How many minutes did you spend in the shower last time?");
			
			int minutes = Input.get_int();
			
			System.out.println("Oh dear! you're wasting " + Calc_Bottles(minutes) + " bottles.");
			System.out.println("Wanna try again? y / n");
			answer = Input.get_string();			
		} while (answer.equals("y"));
	}
	
	public static int Calc_Bottles (int minutes) {		
		return minutes * bottles;
	}
}