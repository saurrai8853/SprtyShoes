package coms.service.service;

import java.util.List;

import coms.shoees.model.PurchaseItem;
import coms.shoees.model.PurchaseOrder;
import coms.shoees.model.User;



public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
