package Collections;
import java.util.HashMap;

public class hashmap {
	public static void main(String[] args) {

	    // create a hashmap
	    HashMap<String, Integer> numbers = new HashMap<>();

	   /* // add elements to hashmap
	    languages.put("Java", 8);
	    languages.put("JavaScript", 1);
	    languages.put("Python", 3);
	    System.out.println("HashMap: " + languages);
	  } */
	    
	    // Adding elements to hashmap
	    
	    System.out.println("Initial HashMap: " + numbers);
	    // put() method to add elements
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    System.out.println("HashMap after put(): " + numbers);
	  }
	 

}
