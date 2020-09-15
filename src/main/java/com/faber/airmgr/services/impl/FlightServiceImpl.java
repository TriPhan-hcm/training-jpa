package com.faber.airmgr.services.impl;

import com.faber.airmgr.data.entities.AirPortEntity;
import com.faber.airmgr.data.entities.FlightEntity;
import com.faber.airmgr.data.repositories.AirPortRepository;
import com.faber.airmgr.data.repositories.FlightRepository;
import com.faber.airmgr.models.AddFlightModel;
import com.faber.airmgr.models.FlightFilterModel;
import com.faber.airmgr.services.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The class FlightServiceImpl.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 19:36
 * @des todo
 */
@Slf4j
@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    private final AirPortRepository airPortRepository;

    public FlightServiceImpl(FlightRepository flightRepository, AirPortRepository airPortRepository) {
        this.flightRepository = flightRepository;
        this.airPortRepository = airPortRepository;
    }

    @Override
    public Page<FlightEntity> filter(FlightFilterModel model) {
        return flightRepository.filter(model.getFromAirPort(), model.getToAirPort(), model.getDepartureDate(), model.getArrivalDate(), PageRequest.of(model.getPage(), 30));
    }

    @Override
    public List<FlightEntity> findAll() {
        return flightRepository.findAll();
    }

    @Override
    public void add(AddFlightModel model) {
        AirPortEntity arrivalPort = airPortRepository.findById(model.getArrivalPort()).orElseThrow(() -> new RuntimeException("ArrivalPort notfound"));
        AirPortEntity departurePort = airPortRepository.findById(model.getDeparturePort()).orElseThrow(() -> new RuntimeException("DeparturePort notfound"));

        flightRepository.save(FlightEntity
                .builder()
                .arrivalPort(arrivalPort)
                .departurePort(departurePort)
                .price(model.getPrice())
                .arrivalTime(model.getArrivalTime())
                .departureTime(model.getDepartureTime())
                .build());

    }
}
