package com.visa.dmpd.opera;

import java.util.*;

public class LearningComparableFunction {

	public static void main(String[] args) {
		List < String > ls = new ArrayList<String>() ; 
		while(true)
		{
			if(ls.size() >= 5)
				break ; 
			System.out.println("Enter a word");
			Scanner sc = new Scanner(System.in) ; 
			String str = sc.nextLine() ; 
			ls.add(str) ; 
		}

		Collections.sort(ls , (String o1 , String o2)->{
			return o1.length() - o2.length() ;
		});
		displayall(ls)  ;
		Collections.sort(ls );//, new SortByAlphabetically());
		System.out.println("Sorted on the alphabetical basis");
		displayall(ls);
	}

	private static void displayall(List<String> ls) {
		// TODO Auto-generated method stub
		Iterator it = ls.iterator() ; 
		System.out.println("Following are the contents of the list of size :: " + ls.size());
		while(it.hasNext())
			System.out.println(it.next());
	}

}
