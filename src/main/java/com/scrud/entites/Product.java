package com.scrud.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	private String p_name;
	private String p_desc;
	private long p_price;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_desc() {
		return p_desc;
	}
	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	public long getP_price() {
		return p_price;
	}
	public void setP_price(long p_price) {
		this.p_price = p_price;
	}
	
	
	
		public Product(int p_id, String p_name, String p_desc, long p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.p_price = p_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_desc=" + p_desc + ", p_price=" + p_price + "]";
	}

	
	
	
	

}
