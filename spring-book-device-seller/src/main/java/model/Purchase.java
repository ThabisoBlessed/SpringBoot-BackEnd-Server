package model;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="user_id" ,nullable =false)
	private Long user_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", referencedColumnName="id",insertable=false,updatable=false)
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="device_id", referencedColumnName="id",insertable=false,updatable=false)
	private Long deviceId;
	
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="device", referencedColumnName="id",insertable=false,updatable=false)
	private Long device;
	
	
	@Column(name="price" ,nullable =false)
	private Double price;
	
	@Column(name="color" ,nullable =false)
	private String color;
	

@Column(name="purchaseTime",nullable =false)

private LocalDateTime purchaseTime;

	
	
}
