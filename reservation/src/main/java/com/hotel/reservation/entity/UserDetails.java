package com.hotel.reservation.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Reservation> reservations;
}
