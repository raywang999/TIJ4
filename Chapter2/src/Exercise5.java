class dog{
	String name;
	String says;
}

class Exercise5{
	public static void main(String[] args){
		dog Spot = new dog();
		dog Scruffy = new dog();
		Spot.name = "Spot";
		Spot.says = "Ruff";
		Scruffy.name = "Scruffy";
		Scruffy.says = "Wurf";
		System.out.println("Here's : " + Spot.name + 
				   " , he says '" + Spot.says + "'");
		System.out.println("Here's : " + Scruffy.name + 
				   " , he says '" + Scruffy.says + "'");
		
	}
}
