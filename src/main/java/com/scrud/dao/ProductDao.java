package com.scrud.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.scrud.entites.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getAllProducts(){
		
		List<Product> products= hibernateTemplate.loadAll(Product.class);
		
		return products;
		
	}
	
	@Transactional
	public void deleteProduct(int p_id) {
		
	Product	p=this.hibernateTemplate.load(Product.class, p_id);
	this.hibernateTemplate.delete(p);
	
	}
	
	public Product getSingleProduct(int p_id) {
		
		return this.hibernateTemplate.get(Product.class, p_id);
		
	}
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
	
	
}
