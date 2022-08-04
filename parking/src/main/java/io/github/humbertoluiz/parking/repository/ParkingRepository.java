package io.github.humbertoluiz.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.github.humbertoluiz.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
