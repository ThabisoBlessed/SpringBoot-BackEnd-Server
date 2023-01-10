package Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import java.util.*;
import model.Device;
import repository.DevicesRepository;

@Service
public class DeviceServiceImplementation  implements DeviceService{

	private DevicesRepository deviceRepo;

	public DeviceServiceImplementation(DevicesRepository deviceRepo) {
		this.deviceRepo=deviceRepo;
	}

	@Override
	public Device saveDevice(Device device)
	{
		
		device.setCreateTime(LocalDateTime.now());
		
		return deviceRepo.save(device);
	}
	
	@Override
	public void deleteDevice(Long id)
	{
		deviceRepo.deleteById(id);
	}
	
	@Override
	public List<Device> findAll()
	{
		return deviceRepo.findAll();
	}
	
	
	
}
