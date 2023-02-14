import java.util.*;

public class ProteinCalculator {

	
	
	
	
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int input;
			System.out.println("how many grams of protein per day?");
			input=in.nextInt();
			int weekly;
			weekly=input*7;
			
			int[] myArray= {};
			 myArray=Menu.menu();
			 
			Calculator.calculator(myArray,weekly);
		}

		
		
		
	}

}
