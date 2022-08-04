package io.github.humbertoluiz.parking.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import io.github.humbertoluiz.parking.model.Parking;
import io.github.humbertoluiz.parking.repository.ParkingRepository;

@Service
public class ParkingService {

	private final ParkingRepository parkingRepository;

	public ParkingService(ParkingRepository parkingRepository) {
		this.parkingRepository = parkingRepository;
	}
	
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Parking> findAll() {
        return parkingRepository.findAll();
    }
}
