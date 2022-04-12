package com.bitswilp.group26.oms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitswilp.group26.oms.to.Order;


public interface OMSRepo extends JpaRepository<Order, Integer> {

}
