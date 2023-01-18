package com.hotel.reservation.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id", referencedColumnName = "id")
    private UserDetails userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_number")
    private Rooms roomNumber;

    @Column
    private LocalDate bookedDate;

    @Column
    private LocalDate fromDate;

    @Column
    private LocalDate toDate;

    @Column
    private LocalDate updatedDate;
}
