package com.faber.airmgr.services;

import com.faber.airmgr.data.entities.OrderEntity;
import com.faber.airmgr.models.FlightOrderModel;

import java.util.List;

/**
 * The interface OrderService.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 9/13/2020
 */
public interface OrderService {
    void doOrder(FlightOrderModel model);

    List<OrderEntity> findAll();
}
