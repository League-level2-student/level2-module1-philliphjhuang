package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {

	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
	
			strings.add("a");
			strings.add("b");
			strings.add("c");
			strings.add("d");
			strings.add("e");
			
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s: strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i<strings.size(); i+=2) {
			String s = strings.get(i);
			System.out.println(s);
		}
		//6. Print all the Strings in reverse order.
		for(int i = (strings.size()-1); i>=0; i--) {
			String s = strings.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s: strings) {
			if(s.equals("e")) {
			System.out.println(s);
		}
		}
	}
}
