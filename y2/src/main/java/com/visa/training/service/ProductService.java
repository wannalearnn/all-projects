package com.visa.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.training.dal.MySqlProductDao;
import com.visa.training.dal.ProductDAO;
import com.visa.training.domain.Product;
@Component("service")
public class ProductService {
	ProductDAO  dao ;// = new MySqlProductDao() ; // now no need of new operator
	@Autowired
	public void setDao(ProductDAO dao ){
		this.dao = dao ; 
		System.out.println("[From within service. Get object of DAO]");
	}
	public void delete(int id) {
		dao.delete(id);
	}

	public void changePrice(int id, float newPrice) {
		dao.changePrice(id, newPrice);
	}

	public List<Product> findAll() {
		return dao.findAll();
	}

	public Product addNew(Product P) {
		if( P.getPrice() * P.getQoh() >= 10000){
			return dao.addNew(P) ;
		}
		else 
		{
			throw new InsufficientValueException("The value(price*qoh) must atleast be 10000") ; 
		}
	} 
	
	
}
