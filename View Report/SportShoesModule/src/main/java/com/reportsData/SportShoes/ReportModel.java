package com.reportsData.SportShoes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reports" )
public class ReportModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "repID")
	int repID;
	
	@Column(name = "clientID")
	int clientID ;
	
	@Column(name = "product")
	String product;
	
	@Column(name = "category")
	String category;
	
	@Column(name = "sale")
	Float sale;
	
	@Column(name = "pourchase")
	Float pourchase;

	public int getRepID() {
		return repID;
	}

	public void setRepID(int repID) {
		this.repID = repID;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Float getSale() {
		return sale;
	}

	public void setSale(Float sale) {
		this.sale = sale;
	}

	public Float getPourchase() {
		return pourchase;
	}

	public void setPourchase(Float pourchase) {
		this.pourchase = pourchase;
	}
	
	
	

}
