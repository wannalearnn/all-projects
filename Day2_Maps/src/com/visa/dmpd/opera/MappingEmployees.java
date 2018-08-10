package com.visa.dmpd.opera;

import java.util.*;


public class MappingEmployees {
	public static void main(String[] args) {
		Map< String, String > empMap = new HashMap<>() ; 
		empMap.put( "E1234", "STEVE JOBS") ; 
		empMap.put("E2345","BILL GATES"); 
		empMap.put("E3456"  , "LARRY ELLISON") ;
		empMap.put("E4567" , "JEFF BEZOS") ; 
		empMap.put("E8765" , "MARK ZUCKERBERG") ; 
		empMap.put("E6789" , "LARRY PAGE") ; 
		Scanner s =  new Scanner(System.in ) ; 
		while(true)
		{
			System.out.println("Enter any key value :: ") ;
			String input = s.nextLine() ;
			if(input.equalsIgnoreCase("quit"))
			{
				break ; 
			}
			if(empMap.containsKey(input)){
				System.out.println("Employess exists with the name " + empMap.get(input));
			}
			else
			{
				System.out.println("No employes with this ID .") ;
			}
		}
		
		System.out.println("Contents of the MAP :: ");
		Set <String> keys  = empMap.keySet() ; 
		for(String akey : keys)
		{
		System.out.println(akey +  "" + empMap.get(akey));		
		}
	}

}
