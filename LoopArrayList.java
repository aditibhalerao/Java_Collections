package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LoopArrayList {
	
	public static void main(String[] args){
		
		ArrayList aList= new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		
		//Using For loop
		System.out.println("Print the arrayList using For Loop");
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i)+" ");
		}
		
		System.out.println("Print the arrayList using For each Loop");
		for(Object s:aList) {
			System.out.println(s+" ");
		}
		
		System.out.println("Print the arrayList using Iterator");
		Iterator it =aList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Print the arrayList using ListIterator");
		ListIterator listIt = aList.listIterator(aList.size());
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());	
		}
	}

	
}
