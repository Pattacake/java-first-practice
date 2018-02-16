package Dog;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
	public void test() {
		Dog dogOne = new Dog ();
		dogOne.name = "Lach";
		dogOne.type = "Lab";
		dogOne.age = 7;
		dogOne.bark();
		
		Dog dogTwo = new Dog ();
		dogTwo.name = "Bill";
		dogTwo.type = "Collie";
		dogTwo.age = 9;
		dogTwo.bark();
		
		Dog dogThree = new Dog ();
		dogThree.name = "Markos";
		dogThree.type = "Poodle";
		dogThree.age = 2;
		dogThree.bark();
		
	}

}
