/**
 * 
 */

/**
 * @author marjeanmayo-b_snhu
 *
 */
public class Dog {
// class is created name dog
	//below define and initialize the private variables. 
	private  int DogSpaceNumber;
	private double DogWeight;
	private boolean Grooming;
//Constructor dog 
	public Dog() {
		DogSpaceNumber = 1235658;
		DogWeight = 50;
		Grooming = true; 
	}
	// mutator 
	// getter this gets the private int and creates access to the print
	
	public void setDogSpaceNumber(int spaceNumber) {
		DogSpaceNumber = spaceNumber;
		
	}
	public void setDogWeight(double weight) {
		DogWeight = weight;
	}
	public void setGrooming(boolean groom) {
		Grooming = groom; 
		
	}
	
	
	//accessor 
	// this makes the variables accessible to print.
	
	public int getDogSpaceNumber() {
		return DogSpaceNumber; 
	}
	public double getDogWeight() {
		return DogWeight;
	}
	public boolean getGrooming() {
		return Grooming; 
	}
	
}
