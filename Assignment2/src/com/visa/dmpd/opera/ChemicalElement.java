package com.visa.dmpd.opera;

public class ChemicalElement {
	int atomicNumber  ;
	String symbolicName ; 
	String fullName  ; 
	public ChemicalElement(int atomicNumber , String symbolicName , String fullName){
		this.atomicNumber = atomicNumber ; 
		this.symbolicName = symbolicName ; 
		this.fullName   = fullName ; 
	}
	boolean isAlkaliMetal(int atomicNumber){
		boolean check[] = new boolean[120]  ;
		for(int i=0;i<120;i++)
			check[i] = false ; 
		check[3]=check[11]=check[19]=check[37]=check[55]=check[87] = true ; 
		return check[atomicNumber] ; 
	}
	boolean isTransitionMetal(int atomicNumber ){
		boolean check[] = new boolean[120]  ;
		int i ; 
		for(i=0;i<120;i++)
			check[i] = false ; 
		for(i=21;i<=31;i++)
			check[i] = true  ;
		for(i=39;i<=48;i++)
			check[i] = true  ;
		for(i=72;i<=80;i++)
			check[i] = true ;
		for(i=104;i<=112;i++)
			check[i] = true; 
		check[3]=check[11]=check[19]=check[37]=check[55]=check[87] = true ; 
		return check[atomicNumber] ; 
	}
	boolean isMetal(int atomicNumber){
		boolean check[] = new boolean[120]  ;
		int i;
		for(i=0;i<120;i++)
			check[i] = false ; 
		check[13]=check[49]=check[50]=check[81]=check[82]=check[83] = true ;
		for(i=113;i<=116;i++)
			check[i] = true; 
		return check[atomicNumber] ; 
	}
	

}
