package com.visa.dmpd.opera;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class LearnPredicate {
	public static void main(String[] args) {
		// System.out.println("Enter the nmber of string :: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			strList.add(str);
		}
		ArrayList<String> shwords = process(strList, (String s) -> s.length() < 4);
		ArrayList<String> wordswithB = process(strList , (String s)->s.contains("b")) ; 
		ArrayList<String> evenLengthString = process(strList , (String s)->s.length()%2 == 0) ; 
		System.out.println("The list of string having short words :: ");
		shwords.forEach(st->System.out.println(st));
		System.out.println("The list of string having short words using consumer function (lambda bsically):: ");
		shwords.forEach(System.out::println);
		System.out.println("the list of words containing B :: ") ;
		System.out.println(wordswithB);
		System.out.println("The list of words havng even length :: ");
		System.out.println(evenLengthString);
	}

	private static void print(ArrayList<String> shwords) {
		// TODO Auto-generated method stub

	}

	public static ArrayList process(ArrayList<String> strList, Predicate<String> pre) {
		ArrayList<String> res = new ArrayList<String>();
		for (String xx : strList) {
			if (pre.test(xx))
				res.add(xx);
		}
		return res;

	}

}
