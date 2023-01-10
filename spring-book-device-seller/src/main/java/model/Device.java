package model;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="device")
public class Device {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable=false ,length=100)
	private String name;

	
	@Column(name="description",nullable=false ,length=100)
	private  String description;
	
	@Column(name="price",nullable=false )
	private Double price;
	

	@Column(name="createTime",nullable =false)
	private LocalDateTime createTime;

	//device  type
	
	@Enumerated(EnumType.STRING)
	@Column(name="device_type",nullable =false)
	private DeviceType  devicetype;


	/*
	 * @OneToMany(fetch=FetchType.LAZY ,mappedBy ="device") private Set<Purchase>
	 * purchaseList;
	 */
}
