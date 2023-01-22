package com.hotel.reservation.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String clientFullName;

    @Column
    private Integer roomNumber;

    @Column
    private List<LocalDate> reservationDate;
}
