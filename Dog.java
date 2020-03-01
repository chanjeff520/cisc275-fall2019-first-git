import java.util.*;
import java.lang.*;
import java.io.*;

public class Dog extends Animal{
	public Dog(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	public String toString(){
		return name + ": " + legs + " legs";
	}
	/*
	class Dog implements Comparable<Dog>{ // Natural Order sorting by default
		@Override
		public int compareTo(Dog d){ // Advantage between comparable is it we can have as many sort as we want
			if(
		}
	}
	*/
	public static void main(String[] args){
		ArrayList<Dog> pack = new ArrayList<Dog>();
		pack.add(new Dog("Spot",4));
		pack.add(new Dog("Spot",4));
		pack.add(new Dog("Water",4));
		System.out.println(pack);
		//Collections.sort(d);
		//Collections.sort(pack);
		//collections.sort(pack,new AnimalCompare()); // don't do this please.
	}
}
