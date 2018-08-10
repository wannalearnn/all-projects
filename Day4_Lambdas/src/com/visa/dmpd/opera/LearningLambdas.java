package com.visa.dmpd.opera;

import java.util.*;

public class LearningLambdas {
	public static void main(String[] args)
	{	
		System.out.println("enter the nujmber of string you wanna enter :: ");
		Scanner sc = new Scanner(System.in) ; 
		int n = sc.nextInt() ; 
		List<String> strList = new ArrayList<String>()  ;
		for(int i = 0 ; i < n  ; i++)
		{
			String s = sc.nextLine() ; 
			strList.add(s) ; 
		}
		
		System.out.println("The list of the strings obtained is :: ");
		System.out.println(Arrays.asList(strList));
		
		Collections.sort(strList , (String o1 , String o2)->{
			return o1.length() - o2.length() ;
		});
		System.out.println("The list of the strings after sorting in increasing order of length:: ");
		System.out.println(Arrays.asList(strList));
		Collections.sort(strList , (String o1 , String o2)->{
			return  - o1.length() + o2.length() ;
		});
		System.out.println("The list of the strings after sorting in decreasing  order of length:: ");
		System.out.println(Arrays.asList(strList));
		Collections.sort(strList);
		System.out.println("The list of the strings after sorting in decreasing  order lexicographically :: ");
		System.out.println(Arrays.asList(strList));
		Collections.sort(strList , (String o1 , String o2)->{
			if(o1.c)
		});
		System.out.println("The list of the strings after sorting in decreasing  order of length:: ");
		System.out.println(Arrays.asList(strList));
		
	}
}
