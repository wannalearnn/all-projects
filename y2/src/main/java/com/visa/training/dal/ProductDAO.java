package com.visa.training.dal;

import java.util.List;

import com.visa.training.domain.Product;

public interface ProductDAO {

	void delete(int id);

	void changePrice(int id, float newPrice);

	Product findOne(int id);

	List<Product> findAll();

	Product addNew(Product P);

}