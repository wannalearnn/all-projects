package com.visa.dmpd.opera.modular;

public class Circle {
	private double radius ; 
	public Circle(double radius){
		super() ; 
		this.radius = radius ; 
	}
	public double getRadius(){
		return radius ; 
	}
	public double area(){
		return Math.PI*radius*radius ; 
	}
}
