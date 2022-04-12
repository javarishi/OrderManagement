package com.bitswilp.group26.oms.to;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
CREATE TABLE `order` (
  `ORDER_ID` int NOT NULL,
  `CUSTOMER_ID` varchar(20) NOT NULL,
  `TRANSACTION_ID` varchar(45) NOT NULL,
  `STATUS` varchar(45) DEFAULT NULL,
  `ORDER_DATE` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `SHIPPING_METHOD` varchar(45) DEFAULT NULL,
  `SHIPPING_AMOUNT` decimal(10,4) DEFAULT NULL,
  `SPECIAL_INSTRUCTIONS` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`),
  UNIQUE KEY `ORDER_ID_UNIQUE` (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 *
 */
@Entity
@Table(name = "retail_order")
public class Order {
	@Id @Column(name = "ORDER_ID")
	private int orderId;
	
	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
	@Column(name = "TRANSACTION_ID")
	private String transactionId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ORDER_DATE")
	private Timestamp orderDate;
	
	@Column(name = "SHIPPING_METHOD")
	private String shippingMethod;
	
	@Column(name = "SHIPPING_AMOUNT")
	private float shippingAmount;
	
	@Column(name = "SPECIAL_INSTRUCTIONS")
	private String specialInstruction;

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the orderDate
	 */
	public Timestamp getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the shippingMethod
	 */
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 * @param shippingMethod the shippingMethod to set
	 */
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	/**
	 * @return the shippingAmount
	 */
	public float getShippingAmount() {
		return shippingAmount;
	}

	/**
	 * @param shippingAmount the shippingAmount to set
	 */
	public void setShippingAmount(float shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	/**
	 * @return the specialInstruction
	 */
	public String getSpecialInstruction() {
		return specialInstruction;
	}

	/**
	 * @param specialInstruction the specialInstruction to set
	 */
	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}
}
