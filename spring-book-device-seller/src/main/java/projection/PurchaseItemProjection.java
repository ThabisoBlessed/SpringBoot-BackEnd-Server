package projection;

import java.time.LocalDateTime;

import model.DeviceType;

public interface PurchaseItemProjection {

	String  getName();
	DeviceType getType();
	Double  getPrice();
	String getColor();
	LocalDateTime getPurchaseTime();
	
}
