
public class ProteinParent {
	int calories;
	int protein;
	int price;
	int fat;
	public ProteinParent() {
		
	}
	
	
}
class Beef extends ProteinParent{
	

	public Beef() {
		calories=60;
		protein=5;
		fat=5;
	}
}
class ChickenBreast extends ProteinParent{
	public ChickenBreast() {
		calories=35;
		protein=5;
		fat=1;
	}
}
class ChickenThigh extends ProteinParent{
	public ChickenThigh() {
		calories= 69;
		protein=7;
		fat=4;
	}
}
class Cod extends ProteinParent{
	public Cod() {
	calories = 49;
	protein = 4;
	fat=2;
	}
}
class Salmon extends ProteinParent{
	public Salmon() {
	calories = 39;
	protein = 7;
	fat=1;
	}
}
class Bison extends ProteinParent{
	public Bison() {
	calories = 63;
	protein=5;
	fat=5;
	}
}