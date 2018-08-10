package com.visa.dmpd.opera.modular;

import java.util.*;

public class generateCirclem {

	public static void main(String[] args) {
		ArrayList<Circle> radList = new ArrayList()  ;
		radList = buildAListOfRandom() ; 
		printAllCircles(radList) ; 
		System.out.println("**************************************");
		removeSmallRadius(radList) ; 
		printAllCircles(radList);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}

	private static void removeSmallRadius(ArrayList<Circle> radList) {
		Iterator<Circle> it = radList.iterator()  ;
		while(it.hasNext()){
			Circle tmp = it.next()  ;
			if(tmp.getRadius() < 0.5)
				it.remove();
		}
		
	}

	private static void printAllCircles(ArrayList<Circle> radList) {
		System.out.println("There are " + radList.size() +  " circles ");
		Iterator <Circle> it = radList.iterator() ; 
		while(it.hasNext()){
			Circle tmp = it.next() ; 
			System.out.println("Rdius  = " + tmp.getRadius() + " Area = " + tmp.area());
		}
	}

	private static ArrayList<Circle> buildAListOfRandom() {
 
		ArrayList<Circle> ls = new ArrayList<Circle>()  ;  
		while(true)
		{
			double x = Math.random() ; 
			if(x  < 0.01)
				break  ;
			else
			{
				Circle tmp = new Circle(x) ; 
				ls.add(tmp) ; 
			}
		}
		return ls;
	}
	
}
