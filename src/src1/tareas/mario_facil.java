package src1.tareas;

import libs.Input;

public class mario_facil {
	

	public static void main(String args[]) {
		String answer = "y";
		do
		{
			System.out.println("Welcome to Mario World! \nHow many steps do you want in the stair?");
			int Steps = Input.get_int();
			
			if (Are_Valid_Steps(Steps)) {
				System.out.println(Construct_Pyramid(Steps));
			}else {
				System.out.println("GAME OVER - Invalid steps");
			}			
			
			System.out.println("Wanna try again? y / n");
			answer = Input.get_string();
		} while (answer.equals("y"));
	}
	
	public static boolean Are_Valid_Steps (int Steps) {
		if (Steps >= 2 && Steps <= 25) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static String Construct_Pyramid (int Steps) {
		String Pyramid = "";
		int cols = Steps;
		
		for (int row=1; row <= Steps; row++) {
			for (int col = 0; col <= Steps; col++ ) {
				if (col >= cols-1) {
					Pyramid += "#";
				}else {
					Pyramid += " ";
				}				
			}
			Pyramid += "\n";
			cols --;
		}
		
		return Pyramid;		
	}
}
	
	