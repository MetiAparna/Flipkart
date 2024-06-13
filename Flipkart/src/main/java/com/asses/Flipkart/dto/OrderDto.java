package com.asses.Flipkart.dto;

import java.io.Serializable;

public class OrderDto implements Serializable
{
	private long product_id;
	private  long quantity;
	private String paymentmode;
	
	
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

}
