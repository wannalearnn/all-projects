package com.visa.dmpd.opera;

public class ChemicalElementApp {

	public static void main(String[] args) {
		ChemicalElement c1 = new ChemicalElement(3,"Li","Lithium") ; 
		System.out.println(c1.isMetal(c1.atomicNumber));
	}
	public static void printMetalDetails(ChemicalElement e){
		System.out.println("Is "+e.fullName+"a metal ?? :: " + e.isMetal(e.atomicNumber));
		System.out.println("Is "+e.fullName+"a AlkaliMetal?? :: " + e.isAlkaliMetal(e.atomicNumber));
		System.out.println("Is "+e.fullName+"a Transition Metal ?? :: " + e.isTransitionMetal(e.atomicNumber));
	}
}
