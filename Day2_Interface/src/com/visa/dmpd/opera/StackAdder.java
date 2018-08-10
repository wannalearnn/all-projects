package com.visa.dmpd.opera;

public class StackAdder {
	public double findSum(Stack<? extends Number> s ){
		double sum = 0 ; 
		int size = s.size() ; 
		for(int i = 0  ; i < size ; i++ )
		{
			sum = sum  + s.pop().doubleValue() ; 
		}
		return sum ; 
	}
}
