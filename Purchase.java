package com.fmt;

public class Purchase extends Equipment implements Invoiceable{
	private String name;
	private String model;
	public Purchase(String itemCode,double price,String name,String model) {
		super(price,itemCode);
		this.name=name;
		this.model=model;
		

	}
	public double getSubTotalPay() {
		return super.getPrice();
	}
	public double getTotalPay() {
		return super.getPrice()-getTaxes();
	}
	
	public double getTaxes() {
		return 0;
	}
	public String getItemCode() {
		return super.getCode();
	}
	
	public double getTotal() {
		return super.getPrice();
	}
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	
	

}
