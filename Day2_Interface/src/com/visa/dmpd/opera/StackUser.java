package com.visa.dmpd.opera;

public class StackUser {

	public void workWithStack(Stack s){ 
		
		System.out.println("About to push an element");
		s.push("Test") ; 
		System.out.println("About to pop an element ");
		Object Element = s.pop(); 
		System.out.println("The element popped out of the stack is  :: " + Element);
	}

}
