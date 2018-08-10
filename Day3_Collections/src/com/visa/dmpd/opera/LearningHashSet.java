package com.visa.dmpd.opera;

import java.util.*;

public class LearningHashSet {
	public static void main(String args[]){
		Set < String > hs = new HashSet<String>() ; 
		while(true)
		{
			if(hs.size() >= 10)
				break ; 
			System.out.println("Enter a word");
			Scanner sc = new Scanner(System.in) ; 
			String str = sc.nextLine() ; 
			if(hs.contains(str)){
				System.out.println("Duplicate element");
			}
			else
			hs.add(str) ; 
			
		}
		Iterator it = hs.iterator() ; 
		System.out.println("Total number of elementts on the set :: " + hs.size());
		while(it.hasNext())
		{
			System.out.println(it.next()) ; 
		}
	}
}
