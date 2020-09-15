package com.faber.airmgr.models;

import com.faber.airmgr.data.entities.AirPortEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

/**
 * The class AddFlightModel.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 23:17
 * @des todo
 */
@Data
public class AddFlightModel implements Serializable {
    private Long departurePort;

    private Long arrivalPort;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date departureTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date arrivalTime;

    private Long price;
}
