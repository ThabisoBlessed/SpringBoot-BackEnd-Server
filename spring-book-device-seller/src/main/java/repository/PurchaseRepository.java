package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import  java.util.List;


import model.Purchase;
import projection.PurchaseItemProjection;

public interface PurchaseRepository  extends JpaRepository<Purchase,Long>{
	 
	//find purchase of user
	
	@Query("Select " + "d.name as name ,d.deviceType as type,p.price as price ,p.color as color ,p.purchaseTime as purchase  " + 
	"from purchase p left join device  d on  d.id ==p.deviceId "
	+ "where p.user_id =:userId "
			)
	 
	List<PurchaseItemProjection>  findAllPurchasesOfUser(@Param("user_id") Long userId);

}
