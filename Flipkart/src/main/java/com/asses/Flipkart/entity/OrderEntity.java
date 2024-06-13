package com.asses.Flipkart.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="order_info")
public class OrderEntity implements Serializable
{
	@Id
	@GenericGenerator(name="auto_gen", strategy="increment")
    @GeneratedValue(generator="auto_gen")
	@Column(name="alt_key")
	private long alt_key;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	private ProductEntity productEntity;
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="total_price")
	private long total_price;
	
	@Column(name="sold_date")
	private String sold_date;
	
	@Column(name="payment_mode")
	private String payment_mode;

	
	
	
	
	
	
	
	public long getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	

	public long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}

	public String getSold_date() {
		return sold_date;
	}

	public void setSold_date(String sold_date) {
		this.sold_date = sold_date;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

}
