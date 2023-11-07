package coms.sporty.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import coms.shoees.model.PurchaseOrder;



public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
	

}
