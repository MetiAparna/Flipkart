package com.asses.Flipkart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="product_info")
public class ProductEntity implements Serializable
{
	@Id
	@GenericGenerator(name="auto_gen", strategy="increment")
    @GeneratedValue(generator="auto_gen")
	@Column(name="alt_key")
	private long alt_key;
	
	@Column(name="name")
	private String name;
	
	@Column(name="product_type")
    private String product_type;
	
	@Column(name="price")
    private long price;
	
	@Column(name="description")
    private String description;
	
	@Column(name="manfacture_date")
    private String manfacture_date;

	
	
	
	
	
	
	
	public long getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManfacture_date() {
		return manfacture_date;
	}

	public void setManfacture_date(String manfacture_date) {
		this.manfacture_date = manfacture_date;
	}
	

}
