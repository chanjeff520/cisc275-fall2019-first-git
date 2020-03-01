import java.util.*;
public class Animal{
	public int legs;
	public String name;

	class AnimalCompare implements Comparator<Animal>{ //Finish this later
		@Override
		public int compare(Animal a1, Animal a2){
			if(a1.name.compareTo(a2.name) == 0){
				return a1.legs.compareTo(a2.legs);
			}
			else{
				return a1.name.compareTo(a2.name);
			}
		}
	}
}
