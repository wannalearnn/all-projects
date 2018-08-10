package com.visa.dmpd.opera;

public class TypeParamsDemo {

	public static void main(String[] args) {
		StackAdder  adder = new StackAdder() ; 
		Stack<Number> s = new ArrayStack<Number>()  ; 
		s.push(10);
		s.push(87);
		s.push(30);
		s.push(40);
		s.push(50);
		double  sum  = adder.findSum(s) ; 
		System.out.println(sum);
	}

}
