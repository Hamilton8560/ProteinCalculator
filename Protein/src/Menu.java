import java.util.Scanner;
import java.util.Stack;

public class Menu {

	public static int[] menu() {
		Stack<Integer> choices=new Stack<>();
		Scanner in = new Scanner(System.in);
		String[] myArray={"Beef","Bison","Chicken Breasts","Chicken Thighs","Cod","Salmon"};
		System.out.println("For any sources of food you would not eat");
 		System.out.println("Enter Y/N");
		String input = "";
		for(int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i]+"?");
			try {
			input=in.next();
			}
			catch(Exception e) {
				System.out.println("try again, didnt enter proper value");
			}
			input=input.toLowerCase();
			if(input.equals("y")) {
				choices.push(i);
			}
			else {
				System.out.println("denied");
			}
			}
			
			int[] response = new int[choices.size()];
			int count=0;
			while(!choices.isEmpty()) {
				response[count]=choices.pop();
				count++;
			}
			
			
		
		
		
		
		return response;
		
	}
		
	}


