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
@Table(name="stock_info")
public class StackEntity  implements Serializable
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
	private long quantity;
	
	public long getAlt_key() {
		return alt_key;
	}
	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}
	
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public ProductEntity getProductEntity() {
		return productEntity;
	}
	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	


}
