package Service;

import java.util.List;

import model.Purchase;
import projection.PurchaseItemProjection;

public interface PurchaseService {

	Purchase savePurchase(Purchase purchase);

	List<PurchaseItemProjection> findPurchaseItemsOfUser(Long userid);

	

	

}
