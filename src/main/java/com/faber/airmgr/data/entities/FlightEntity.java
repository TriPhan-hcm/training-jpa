package com.faber.airmgr.data.entities;

import com.faber.airmgr.infrastructure.domain.DomainEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * The class FlightEntity.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 19:24
 * @des todo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "flight")
@Table(name = "flight")
public class FlightEntity extends DomainEntity<Long> {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "departure_port_id", nullable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private AirPortEntity departurePort;

    @ManyToOne
    @JoinColumn(name = "arrival_port_id", nullable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private AirPortEntity arrivalPort;

    private Date departureTime;

    private Date arrivalTime;

    private Long price;
}
