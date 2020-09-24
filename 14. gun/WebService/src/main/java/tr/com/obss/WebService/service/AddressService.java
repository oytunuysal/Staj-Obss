package tr.com.obss.WebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.obss.WebService.model.Address;
import tr.com.obss.WebService.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;

	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
}
