package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue
	private long portfolioId;
	
	@Column(nullable = false)
	private long customerId;

	public Portfolio(long portfolioId, long customerId) {
		super();
		this.portfolioId = portfolioId;
		this.customerId = customerId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
}
