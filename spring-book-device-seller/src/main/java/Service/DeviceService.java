package Service;

import java.util.List;

import model.Device;

public interface DeviceService {

	Device saveDevice(Device device);

	void deleteDevice(Long id);

	List<Device> findAll();

}
