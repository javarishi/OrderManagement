package com.bitswilp.group26.oms.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitswilp.group26.oms.dao.OMSRepo;
import com.bitswilp.group26.oms.to.Order;

@Component
public class OMSBO {
	
	@Autowired
	OMSRepo omsRepo;
	
	public Order executeGetOrder(int orderId) {
		Order order = omsRepo.findById(orderId).orElse(new Order());
		return order;
	}

	public Order executeUpdateOrder(Order order) {
		Order savedorder = omsRepo.save(order);
		return savedorder;
	}

	public void executeDeleteOrder(Order order) {
		omsRepo.deleteById(order.getOrderId());	
	}

	public Order executeCreateOrder(Order order) {
		Order savedorder = omsRepo.save(order);
		return savedorder;
	}

}
