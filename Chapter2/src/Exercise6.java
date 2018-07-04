import static net.mindview.util.Print.*;

class Exercise6{
	public static void main(String[] args){
		dog Spot = new dog();
		dog Scruffy = new dog();
		dog Spotty = new dog();
		Spot.name = "Spot";
		Spot.says = "Ruff";
		Scruffy.name = "Scruffy";
		Scruffy.says = "Wurf";
		Spotty.name = "Spot";
		Spotty.says = "Ruff";
		print("Here's : " + Spot.name + 
				   " , he says '" + Spot.says + "'");
		print("Here's : " + Scruffy.name + 
				   " , he says '" + Scruffy.says + "'");
		print("Here's : " + Spotty.name + 
				   " , he says '" + Spotty.says + "'");
		//now we start comparing spot with spotty
		//name comparing
		print("Spot.name is Spotty.name: ");  
		print(Spot.name == Spotty.name);
		print("Spot.name equals() Spotty.name: " + Spot.name.equals(Spotty.name));
		//says comparing
		print("Spot.says is Spotty.says: ");
		print(Spot.says == Spotty.says);
		print("Spot.says equals() Spotty.says: " + Spot.says.equals(Spotty.says));
		//comparing scruffy with spotty
		//name comparing
		print("Scruffy.name is Spotty.name: ");
		print(Scruffy.name == Spotty.name);
		print("Scruffy.name equals() Spotty.name: " + Scruffy.name.equals(Spotty.name));
		//says comparing
		print("Scruffy.says is Spotty.says: ");
		print(Scruffy.says == Spotty.says);
		print("Scruffy.says equals() Spotty.says: " + Scruffy.says.equals(Spotty.says));
	}
}
