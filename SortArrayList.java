package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {

		List al5 = new ArrayList(Arrays.asList(2,1,4,3,6,5,8,7));
		
		System.out.println("Unsorted ArrayList"+al5);
		
		Collections.sort(al5);
		
		System.out.println("Ascending sorted ArrayList"+al5);
		
		Collections.sort(al5,Collections.reverseOrder());
		System.out.println("Descending sorted ArrayList"+al5);
				
	}

}
