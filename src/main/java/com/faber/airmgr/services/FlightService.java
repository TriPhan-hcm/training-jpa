package com.faber.airmgr.services;

import com.faber.airmgr.data.entities.FlightEntity;
import com.faber.airmgr.models.AddFlightModel;
import com.faber.airmgr.models.FlightFilterModel;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * The interface FlightService.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 9/13/2020
 */
public interface FlightService {
    Page<FlightEntity> filter(FlightFilterModel model);

    List<FlightEntity> findAll();

    void add(AddFlightModel model);
}
