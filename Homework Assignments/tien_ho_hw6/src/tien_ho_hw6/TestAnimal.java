package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates an array family of 9 animals from the subclasses. 
 */

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ANIMAL KINGDOM");
		System.out.println();
		
		Animal[] family = new Animal[5];//creates an array called animals that consists of 5 animals
		family[0] = new Snake("Oscar");//declares Maxwell as a snake
		family[1] = new Pig("Charlie");//declares Charlie as a pig
		family[2] = new Pig("Sammy");//declares Sammy as a sheep
		family[3] = new Snake("Hunter");//declares Hunter as a Lizard
		family[4] = new Snake("Rascal");//declares Rascal as a snake
		
		for (Animal animal : family)
		{
			animal.describe();//describes each animal depending upon its class type
			System.out.println();
		}
		
		System.exit(0);//ends the program
	}
}
