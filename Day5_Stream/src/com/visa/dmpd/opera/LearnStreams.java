package com.visa.dmpd.opera;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnStreams {
public static void main(String[] args) {
	System.out.println("Number of elements in the list :: ") ;
	Scanner sc = new Scanner(System.in) ;
	int n = sc.nextInt() ; 
	ArrayList<String> Str = new ArrayList<String>() ; 
	for(int i = 1 ; i <= n ;i++ )
	{
		String str = sc.next() ; 
		Str.add(str) ; 
	}
	Str.forEach(s -> System.out.println("  " + s));
	Str.forEach(LearnStreams::pp);
	ArrayList<String> collector = new ArrayList<String>();
	collector = (ArrayList<String>) Str.stream().map(s -> s  + "!").collect(Collectors.toList()) ; 
	System.out.println(collector);
	collector  = (ArrayList<String>) Str.stream().map(s -> s.replace("i", "eye" )).collect(Collectors.toList());
	System.out.println(collector);
	collector = (ArrayList<String>) Str.stream().filter(s-> s.length()<4).collect(Collectors.toList()) ; 
	System.out.println(collector);
}
public static void pp(String ss)
{
	System.out.println(ss);
}
}
