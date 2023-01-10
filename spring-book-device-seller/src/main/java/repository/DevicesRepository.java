package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Device;

public interface DevicesRepository extends JpaRepository<Device,Long> {
	 
	

}
