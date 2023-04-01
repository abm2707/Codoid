package codoid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringWithoutDuplicates {

	public static void main(String[] args) {
		 ArrayList<String> listWithDuplicates = new ArrayList<>();
	        listWithDuplicates.add("apple");
	        listWithDuplicates.add("banana");
	        listWithDuplicates.add("cherry");
	        listWithDuplicates.add("apple");
	        listWithDuplicates.add("banana");
	        listWithDuplicates.add("date");
	        
	        ArrayList<String> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));
	        System.out.println("Original list with duplicates: " + listWithDuplicates);
	        System.out.println("List without duplicates: " + listWithoutDuplicates);
	}

}
