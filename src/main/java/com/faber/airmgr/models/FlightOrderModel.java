package com.faber.airmgr.models;

import lombok.Data;

import java.io.Serializable;

/**
 * The class FlightOrderModel.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 20:50
 * @des todo
 */
@Data
public class FlightOrderModel implements Serializable {
    private Long flightId;
    private Integer numOfAdults;
    private Integer numOfChildren;
    private Integer numOfSeniors;
    private String returnType;
}
