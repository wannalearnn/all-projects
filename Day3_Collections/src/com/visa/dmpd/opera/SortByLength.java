package com.visa.dmpd.opera;

import java.util.Comparator;

public class SortByLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length() ; 
		//return 0;
	}

}
