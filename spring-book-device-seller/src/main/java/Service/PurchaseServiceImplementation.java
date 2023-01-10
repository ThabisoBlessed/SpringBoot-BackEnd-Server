package Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Purchase;
import projection.PurchaseItemProjection;
import repository.PurchaseRepository;

@Service
public class PurchaseServiceImplementation implements PurchaseService{

	private final PurchaseRepository purchaseRepo;

	public PurchaseServiceImplementation(PurchaseRepository purchaseService) {
		
		this.purchaseRepo= purchaseService;
	}
	
	@Override
	public Purchase savePurchase(Purchase purchase)
	{
		purchase.setPurchaseTime(LocalDateTime.now());
		
		return purchaseRepo.save(purchase);
	}
	
	
	@Override
	public List<PurchaseItemProjection> findPurchaseItemsOfUser(Long userid)
	{

		return purchaseRepo.findAllPurchasesOfUser(userid);
	}
	
	
}
