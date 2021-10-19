package Collections;

import java.util.*;

public class treeset {
	public static void main(String args[]){  
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Raj");  
		set.add("Chethan");  
		set.add("Kishanth");  
		set.add("Chinni");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
