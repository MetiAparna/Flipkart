package com.asses.Flipkart.dto;

import java.io.Serializable;

public class productDto implements Serializable
{
	private String name;
	private String product_type;
	private long price;
	private String description;
	private String manfacturedate;
	private int quantity;
	
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
	public String getManfacturedate() {
		return manfacturedate;
	}
	public void setManfacturedate(String manfacturedate) {
		this.manfacturedate = manfacturedate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
