package com.visa.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.visa.training.domain.Product;
import com.visa.training.service.ProductService;

public class SpringApp {
 public static void main(String[] args) {
	ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicatonContext.xml") ;  
	System.out.println("Spring Container setup done ");
	ProductService service  = (ProductService) springContainer.getBean("service")  ;
	Product test = new Product("spring",99,1000)  ;
	Product created = service.addNew(test);
	System.out.println("details  :: " + created.getInd());
 	}
}
