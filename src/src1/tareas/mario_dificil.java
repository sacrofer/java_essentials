package src1.tareas;

import libs.Input;

public class mario_dificil {
	static int MaxSteps = 25;

	public static void main(String args[]) {
		String answer = "y";
		do
		{
			System.out.println("Welcome to Mario World! \nHow many steps do you want in the pyramid?");
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
		if (Steps >= 2 && Steps <= MaxSteps) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static String Construct_Pyramid (int Steps) {
		String Pyramid = "";
		int rowsize = 0;
		int cols = Steps;
		int cright = MaxSteps+1;
		
		for (int row=1; row <= Steps; row++) {
			rowsize = Steps + row;
			for (int col = 1; col <= rowsize; col++ ) {
				if (col == Steps+1) {
					Pyramid += "  ";
					cright = row;
				}
					
				if (col >= cols || cright <= row) {
					Pyramid += "#";
				}else {
					Pyramid += " ";
				}				
			}
			cright = MaxSteps+1;
			Pyramid += "\n";
			cols --;
		}
		
		return Pyramid;		
	}
}
	
	