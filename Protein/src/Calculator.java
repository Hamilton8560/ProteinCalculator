import java.util.HashMap;
public class Calculator {

public static void calculator(int[] myArray,int weekly){
	HashMap<Integer,String> food = new HashMap<Integer, String>();
	for(int i = 0; i<myArray.length;i++) {
	if(myArray[i]==0) 
	{
	food.put(0, "Beef");

	}
	if(myArray[i]==1) 
	{
	food.put(1, "Bison");

	}
	if(myArray[i]==2) 
	{
	food.put(2, "Chicken Breast");

	}
	if(myArray[i]==3) 
	{
	food.put(3, "Chicken Thigh");

	}
	if(myArray[i]==4) 
	{
	food.put(4, "Cod");
	
	}
	if(myArray[i]==5) 
	{
	food.put(5, "Salmon");
	
	}
	}
	Beef beef = new Beef();
	Bison bison = new Bison();
	ChickenBreast chicken_breast =new ChickenBreast();
	ChickenThigh chicken_thigh = new ChickenThigh();
	Cod cod = new Cod();
	Salmon salmon = new Salmon();
	

	
	//100
	if(food.size()==1) {
		if(food.containsKey(0)) {
		System.out.println("You need to purchase a total of "+(weekly/beef.protein)+"oz "
				+ "or "+ (weekly/beef.protein)/16+"lbs of " +food.get(0));
		System.out.println("consuming "+(weekly/beef.protein)/7+" oz per day" );
		}
		if(food.containsKey(1)) {
		System.out.println("You need to purchase a total of "+(weekly/bison.protein)+"oz "
				+ "or "+ (weekly/bison.protein)/16+"lbs of " +food.get(1));
		System.out.println("consuming "+(weekly/bison.protein)/7+" oz per day" );	
		}
		if(food.containsKey(2)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_breast.protein)+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/16+"lbs of " +food.get(2));
			System.out.println("consuming "+(weekly/chicken_breast.protein)/7+" oz per day" );
	}
		if(food.containsKey(3)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_thigh.protein)+"oz "
					+ "or "+ (weekly/chicken_thigh.protein)/16+"lbs of " +food.get(3));
			System.out.println("consuming "+(weekly/chicken_thigh.protein)/7+" oz per day" );
		}
		if(food.containsKey(4)) {
			System.out.println("You need to purchase a total of "+(weekly/cod.protein)+"oz "
					+ "or "+ (weekly/cod.protein)/16+"lbs of " +food.get(4));
			System.out.println("consuming "+(weekly/cod.protein)/7+" oz per day" );
		}
		if(food.containsKey(5)) {
			System.out.println("You need to purchase a total of "+(weekly/salmon.protein)+"oz "
					+ "or "+ (weekly/bison.protein)/16+"lbs of " +food.get(5));
			System.out.println("consuming "+(weekly/salmon.protein)/7+" oz per day" );
	}}
	//50/50,fish 1/2, no fish beef double
	else if(food.size()==2) {
	if(food.containsKey(0)) {
		System.out.println("You need to purchase a total of "+(weekly/beef.protein)/2+"oz "
				+ "or "+ (weekly/beef.protein)/32+"lbs of " +food.get(0));
		System.out.println("consuming "+(weekly/beef.protein)/14+" oz per day" );
	}
	if(food.containsKey(1)) {
		System.out.println("You need to purchase a total of "+(weekly/bison.protein)/2+"oz "
				+ "or "+ (weekly/bison.protein)/32+"lbs of " +food.get(1));
		System.out.println("consuming "+(weekly/bison.protein)/14+" oz per day" );
	}
	if(food.containsKey(2)) {
		System.out.println("You need to purchase a total of "+(weekly/chicken_breast.protein)/2+"oz "
				+ "or "+ (weekly/chicken_breast.protein)/32+"lbs of " +food.get(2));
		System.out.println("consuming "+(weekly/chicken_breast.protein)/14+" oz per day" );
	}
	if(food.containsKey(3)) {
		System.out.println("You need to purchase a total of "+(weekly/chicken_thigh.protein)/2+"oz "
				+ "or "+ (weekly/chicken_breast.protein)/32+"lbs of " +food.get(3));
		System.out.println("consuming "+(weekly/chicken_thigh.protein)/14+" oz per day" );
	}
	if(food.containsKey(4)) {
		System.out.println("You need to purchase a total of "+(weekly/cod.protein)/2+"oz "
				+ "or "+ (weekly/cod.protein)/32+"lbs of " +food.get(4));
		System.out.println("consuming "+(weekly/cod.protein)/14+" oz per day" );
	}
	if(food.containsKey(5)) {
		System.out.println("You need to purchase a total of "+(weekly/salmon.protein)/2+"oz "
				+ "or "+ (weekly/salmon.protein)/32+"lbs of " +food.get(5));
		System.out.println("consuming "+(weekly/salmon.protein)/14+" oz per day" );
	}
	}
	//33/33/33 fish 1/2, no fish beef double, beef>chicken
	else if(food.size()==3) {
		if(food.containsKey(0)) {
			System.out.println("You need to purchase a total of "+(weekly/beef.protein)/3+"oz "
					+ "or "+ (weekly/beef.protein)/(16*3)+"lbs of " +food.get(0));
			System.out.println("consuming "+(weekly/beef.protein)/(7*3)+" oz per day" );
		}
		if(food.containsKey(1)) {
			System.out.println("You need to purchase a total of "+(weekly/bison.protein)/3+"oz "
					+ "or "+ (weekly/bison.protein)/(16*3)+"lbs of " +food.get(1));
			System.out.println("consuming "+(weekly/bison.protein)/(7*3)+" oz per day" );
		}
		if(food.containsKey(2)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_breast.protein)/3+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/(16*3)+"lbs of " +food.get(2));
			System.out.println("consuming "+(weekly/chicken_breast.protein)/(7*3)+" oz per day" );
		}
		if(food.containsKey(3)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_thigh.protein)/3+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/(16*3)+"lbs of " +food.get(3));
			System.out.println("consuming "+(weekly/chicken_thigh.protein)/(7*3)+" oz per day" );
		}
		if(food.containsKey(4)) {
			System.out.println("You need to purchase a total of "+(weekly/cod.protein)/3+"oz "
					+ "or "+ (weekly/cod.protein)/(16*3)+"lbs of " +food.get(4));
			System.out.println("consuming "+(weekly/cod.protein)/(7*3)+" oz per day" );
		}
		if(food.containsKey(5)) {
			System.out.println("You need to purchase a total of "+(weekly/salmon.protein)/3+"oz "
					+ "or "+ (weekly/salmon.protein)/(16*3)+"lbs of " +food.get(5));
			System.out.println("consuming "+(weekly/salmon.protein)/(7*3)+" oz per day" );
			
		}}
	//25/25/25/25 fish 1/2, no fish beef double, beef>chicken, bison>beef
	else if(food.size()==4) {
		if(food.containsKey(0)) {
			System.out.println("You need to purchase a total of "+(weekly/beef.protein)/4+"oz "
					+ "or "+ (weekly/beef.protein)/(16*4)+"lbs of " +food.get(0));
			System.out.println("consuming "+(weekly/beef.protein)/(7*4)+" oz per day" );
		}
		if(food.containsKey(1)) {
			System.out.println("You need to purchase a total of "+(weekly/bison.protein)/4+"oz "
					+ "or "+ (weekly/bison.protein)/(16*4)+"lbs of " +food.get(1));
			System.out.println("consuming "+(weekly/bison.protein)/(7*4)+" oz per day" );
		}
		if(food.containsKey(2)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_breast.protein)/4+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/(16*4)+"lbs of " +food.get(2));
			System.out.println("consuming "+(weekly/chicken_breast.protein)/(7*4)+" oz per day" );
		}
		if(food.containsKey(3)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_thigh.protein)/4+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/(16*4)+"lbs of " +food.get(3));
			System.out.println("consuming "+(weekly/chicken_thigh.protein)/(7*4)+" oz per day" );
		}
		if(food.containsKey(4)) {
			System.out.println("You need to purchase a total of "+(weekly/cod.protein)/4+"oz "
					+ "or "+ (weekly/cod.protein)/(16*4)+"lbs of " +food.get(4));
			System.out.println("consuming "+(weekly/cod.protein)/(7*4)+" oz per day" );
		}
		if(food.containsKey(5)) {
			System.out.println("You need to purchase a total of "+(weekly/salmon.protein)/4+"oz "
					+ "or "+ (weekly/salmon.protein)/(16*4)+"lbs of " +food.get(5));
			System.out.println("consuming "+(weekly/salmon.protein)/(7*4)+" oz per day" );
			
		}}
	//20/20/20/20/20 fish 1/2, no fish beef double, beef>chicken, bison>beef, salmon>cod
	else if(food.size()==5) {
		if(food.containsKey(0)) {
			System.out.println("You need to purchase a total of "+(weekly/beef.protein)/5+"oz "
					+ "or "+ (weekly/beef.protein)/(16*5)+"lbs of " +food.get(0));
			System.out.println("consuming "+(weekly/beef.protein)/(7*5)+" oz per day" );
		}
		if(food.containsKey(1)) {
			System.out.println("You need to purchase a total of "+(weekly/bison.protein)/5+"oz "
					+ "or "+ (weekly/bison.protein)/(16*5)+"lbs of " +food.get(1));
			System.out.println("consuming "+(weekly/bison.protein)/(7*5)+" oz per day" );
		}
		if(food.containsKey(2)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_breast.protein)/5+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/(16*5)+"lbs of " +food.get(2));
			System.out.println("consuming "+(weekly/chicken_breast.protein)/(7*5)+" oz per day" );
		}
		if(food.containsKey(3)) {
			System.out.println("You need to purchase a total of "+(weekly/chicken_thigh.protein)/5+"oz "
					+ "or "+ (weekly/chicken_breast.protein)/(16*5)+"lbs of " +food.get(3));
			System.out.println("consuming "+(weekly/chicken_thigh.protein)/(7*5)+" oz per day" );
		}
		if(food.containsKey(4)) {
			System.out.println("You need to purchase a total of "+(weekly/cod.protein)/5+"oz "
					+ "or "+ (weekly/cod.protein)/(16*5)+"lbs of " +food.get(4));
			System.out.println("consuming "+(weekly/cod.protein)/(7*5)+" oz per day" );
		}
		if(food.containsKey(5)) {
			System.out.println("You need to purchase a total of "+(weekly/salmon.protein)/5+"oz "
					+ "or "+ (weekly/salmon.protein)/(16*5)+"lbs of " +food.get(5));
			System.out.println("consuming "+(weekly/salmon.protein)/(7*5)+" oz per day" );
			
		}}
	//18/18/18/18/18/18 fish 1/2, no fish beef double, beef>chicken, bison>beef, salmon>cod
	else if(food.size()==6) {
		float bison_protein=(weekly/bison.protein)/4;
		float beef_protein=(weekly/beef.protein)/5;
		float breast_protein=(weekly/chicken_breast.protein)/5;
		float thigh_protein=(float) ((weekly/chicken_thigh.protein)/6.7);
		float cod_protein=(float) ((weekly/cod.protein)/10);
		float salmon_protein=(float) ((weekly/salmon.protein)/10);
		
		System.out.println("SHOPPING LIST AS FOLLOWS");
		System.out.println("Bison: "+bison_protein+" oz, or "+(float)(bison_protein/(16))
				+" lbs");
		System.out.println("Beef: "+beef_protein+" oz, or "+(float)(beef_protein/(16))
				+" lbs");
		System.out.println("Chicken Breast: "+breast_protein+" oz, or "+(float)(breast_protein/16)+" lbs");
		System.out.println("Chicken Thigh: "+thigh_protein+" oz, or "+(float)(thigh_protein/16)+" lbs");
		System.out.println("Cod: "+cod_protein+" oz, or "+(float)(cod_protein/16)+" lbs");
		System.out.println("Salmon: "+salmon_protein+" oz, or "+(float)(salmon_protein/16)+" lbs");
		System.out.println("---------------------------------------");
		System.out.println("----------------PER DAY----------------");
		System.out.println("Bison: " + String.format("%.2f", bison_protein/7)+" ounces");
		System.out.println("Beef: " + String.format("%.2f", beef_protein/7)+" ounces");
		System.out.println("Chicken Breast: " + String.format("%.2f", breast_protein/7)+" ounces");
		System.out.println("Chicken Thigh: " + String.format("%.2f", thigh_protein/7)+" ounces");
		System.out.println("Cod: " + String.format("%.2f", cod_protein/7)+" ounces");
		System.out.println("Salmon: " + String.format("%.2f", salmon_protein/7)+" ounces");
		}
	
	
	/*for(int i = 0; i<myArray.length;i++) {
			finished[i]=food.get(myArray[i]);
			System.out.println(finished[i]);*
		}
	for(int i = 0; i<finished.length;i++) {
	
	
	
		switch(finished[i]) {
		
		case "Beef":
			Beef beef =new Beef();
			break;
		
		case "Bison":
			Bison bison =new Bison();
			break;
		
		case "Chicken Breast":
			ChickenBreast chicken_breast = new ChickenBreast();
			break;
			
		case "Chicken Thigh":
			ChickenThigh chicken_thigh = new ChickenThigh();
			break;
			
		case "Cod":
			Cod cod = new Cod();
			break;
			
		case "Salmon":
			Salmon salmon= new Salmon();
			break;
	}
	}*/

}
}
	

	



