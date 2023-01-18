package com.hotel.reservation.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;
}
