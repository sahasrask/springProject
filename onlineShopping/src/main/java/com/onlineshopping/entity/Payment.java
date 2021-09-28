package com.onlineshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Payment {
	
	@Id
	@SequenceGenerator(name="payment_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payment_seq")
	int paymentId;
	TransactionType transactionType;

	@OneToOne
	@JoinColumn(name="orderId")
	Order order;

	
	
	
	public Payment() {
		super();
	}

	public Payment(int paymentId, TransactionType transactionType, Order order) {
		super();
		this.paymentId = paymentId;
		this.transactionType = transactionType;
		this.order = order;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	
	
	
	

}
