package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSubList2 {

	public static void main(String[] args) {
		
		List<Integer> al7 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
				
		//2nd way to create sublist
		
				List sub2 = new ArrayList(al7.subList(1, 5));
				System.out.println("Sublist derived from main list"+sub2);
				
				//add an element to the sublist: the element is added to the sublist only and NOT to the main list
				sub2.add(6);
				System.out.println("Sublist after adding the element to sublist "+sub2);
				System.out.println("Main list after addng the element to the sub list "+al7);
				
		//adding element to the main list - after adding the element to the main list sublist does NOT update
				
				al7.add(4, 9);
				al7.add(10);
				System.out.println("Sublist after adding the element to main list "+sub2);
				System.out.println("Main list after addng the element to the main list "+al7);
				
		//updating the main list : the sublist is NOT updated 
				al7.set(2, 7);
				System.out.println("Sublist after updating the element in main list "+sub2);
				System.out.println("Main list after updating the element in the main list "+al7);
						

	}

}
