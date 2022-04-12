package com.bitswilp.group26.oms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitswilp.group26.oms.bl.OMSBO;
import com.bitswilp.group26.oms.to.Order;


@RestController
public class OMSController {
	
	@Autowired
	private OMSBO omsBo;
	
	@GetMapping("order")
	public Order getOrder(@RequestParam("orderId") String orderId) {
		Order order = omsBo.executeGetOrder(Integer.parseInt(orderId));
		return order;
	};
	
	
	@PostMapping("order")
	public Order createOrder(@RequestBody Order order) {
		Order savedOrder = omsBo.executeCreateOrder(order);
		return savedOrder;
	};
	
	
	@PutMapping("order")
	public Order updateOrder(@RequestBody Order order) {
		Order updatedOrder = omsBo.executeUpdateOrder(order);
		return updatedOrder;
	};
	
	
	@DeleteMapping("order")
	public String deleteOrder(@RequestBody Order order) {
		omsBo.executeDeleteOrder(order);
		return "Deleted!";
	};
	

}
