package com.visa.dmpd.opera;

public class ArrayStack<E> implements Stack<E> {
	
	private Object contents[];// = new Object[100] ; 
	private int top  = -1 ; 
	
	@Override
	public void push(E anElement) {
		System.out.println("Received an element");
		contents[++top] = anElement ; 
	}

	@Override
	public E pop() {
		System.out.println("about to pop an element" );
		return (E) contents[top--] ; 
	}
	public int size(){
		return top+1 ; 
	}

}
