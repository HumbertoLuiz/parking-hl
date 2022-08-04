package io.github.humbertoluiz.parking.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.humbertoluiz.parking.controller.dto.ParkingDTO;
import io.github.humbertoluiz.parking.controller.dto.ParkingMapper;
import io.github.humbertoluiz.parking.model.Parking;
import io.github.humbertoluiz.parking.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {
		
    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping   
    public ResponseEntity<List<ParkingDTO>> findAll() {
        List<Parking> parkingList = parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
        return ResponseEntity.ok(result);
    }


}
