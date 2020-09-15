package com.faber.airmgr.data.entities;

import com.faber.airmgr.data.enums.TypeFlight;
import com.faber.airmgr.infrastructure.domain.DomainEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "order")
@Table(name = "flight_order")
public class OrderEntity extends DomainEntity<Long> {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date orderTime;

    @Column(name = "return_type")
    @Enumerated(EnumType.STRING)
    private TypeFlight returnType;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private FlightEntity flight;

    @Column(name = "adults_count")
    private Integer adultsCount;

    @Column(name = "seniors_count")
    private Integer seniorsCount;

    @Column(name = "children_count")
    private Integer childrenCount;

    @Column(name = "flight_price")
    private Long flightPrice;

    @Column(name = "total_price")
    private Long totalPrice;

    public Integer totalTickets() {
        return adultsCount + seniorsCount + childrenCount;
    }
}
