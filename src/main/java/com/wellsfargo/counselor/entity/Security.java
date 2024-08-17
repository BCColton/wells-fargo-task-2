package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

	@Id
	@GeneratedValue
	private long securityId;
	
	@Column(nullable = false)
	private long portfolioId;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private double purchasePrice;
	
	@Column(nullable = false)
	private Date purchaseDate;

	public Security(long securityId, long portfolioId, String category, double purchasePrice, Date purchaseDate) {
		this.securityId = securityId;
		this.portfolioId = portfolioId;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
	}

	public long getSecurityId() {
		return securityId;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
