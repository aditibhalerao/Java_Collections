package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {

	static ArrayList al;
	public static void main(String[] args) {

		//1st Way to create array list - create empty array list and then add elements
		
	 al= new ArrayList();
		al.add("aditi");
		
		//2nd way to create array list - specifying the elements of array list during initialization
		
		ArrayList al2 = new ArrayList() {
			
			{
				add("Nilesh");
			}
		};
		
		//3rd way - using Arrays class
		
		ArrayList al3 =new ArrayList(Arrays.asList("geeta")); 
		
		System.out.println(al);
		System.out.println(al2);
		System.out.println(al3);
		
	}

}
