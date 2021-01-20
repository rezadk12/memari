package com.memari.product.api.dao.impl;

import com.memari.product.api.dao.ProductDao;
import org.springframework.stereotype.Repository;
import com.quebic.common.dao.impl.GenericDaoImpl;
import com.memari.product.api.model.Product;

@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao {
	
	public ProductDaoImpl() {
		super(Product.class);
	}
}
