package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromArrayList {

	public static void main(String[] args) {

		ArrayList al4 =new ArrayList(Arrays.asList("a","b","c","d","e","a"));
		
		System.out.println("ArrayList before removing the elements"+al4);
		
		al4.remove("a");
		System.out.println("ArrayList after removing dupe element"+al4);
		
		
		
	}

}
