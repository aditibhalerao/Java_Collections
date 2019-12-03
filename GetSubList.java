package collections;

import java.util.ArrayList;
import java.util.List;

public class GetSubList {

	public static void main(String[] args) {

		List al6 = new ArrayList(){
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		//1st way to create sub list
		List sub = al6.subList(1, 4);
		System.out.println("Sublist derived from the main list is "+sub);
		
		//add an element to the sublist: the elemet is added to the main list as well
		
		sub.add(6);
		System.out.println("Sublist after adding the element "+sub);
		System.out.println("Main list after addng the element to the sub list "+al6);
		
		//adding element to the main list - this cannot be done. 
		
//		al6.add(5, 7);
//		System.out.println("Sublist after adding the element "+sub);
//		System.out.println("Main list after addng the element to the main list "+al6);
		
		
		//updating the main list : the sublist is also updated 
		al6.set(2, 7);
		System.out.println("Sublist after adding the element "+sub);
		System.out.println("Main list after addng the element to the sub list "+al6);
		
		
	}

}
