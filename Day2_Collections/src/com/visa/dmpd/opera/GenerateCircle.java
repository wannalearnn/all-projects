package com.visa.dmpd.opera;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class GenerateCircle {

	public static void main(String[] args) {
		ArrayList<Circle> radList = new ArrayList<Circle>() ; 
		while(true)
		{
			double x = Math.random(); 
			if(x  < 0.01)
			{
				break ; 
			}
			else
			{
				Circle tmp = new Circle(x) ; 
				radList.add(tmp) ; 
			}
		}
		System.out.println("The size of the array list formes is :: " + radList.size());
		System.out.println("The radius of the circles thus obtained is :: ");
		Iterator<Circle> it = radList.iterator() ; 
		while(it.hasNext())
		{
			Circle xx = it.next() ; 
			System.out.println(xx.getRadius());
		}
		it = radList.iterator() ; 
		System.out.println("After removing the circle having radius less Than  0.5");
		while(it.hasNext())
		{
			Circle xx  = it.next() ; 
			if(xx.getRadius() < 0.5)
				it.remove();  
		}
		System.out.println("The size becomes :: " + radList.size() );
		System.out.println("The elements obtained after removing the element :: ")  ;
		it = radList.iterator() ; 
		while(it.hasNext())
		{
			Circle xx = it.next() ; 
			System.out.println(xx.getRadius());
		}
	}

}
