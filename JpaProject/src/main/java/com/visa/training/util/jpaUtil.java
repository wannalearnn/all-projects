package com.visa.training.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaUtil {
	private static EntityManagerFactory mysqlDB ; 
	public static EntityManagerFactory getEmf(){
		if(mysqlDB == null ){
			mysqlDB = Persistence.createEntityManagerFactory("mysql")  ;
		}
		return mysqlDB ; 
	}


}
