package com.hotel.reservation.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
public class Rooms implements Serializable {

    @Id
    private String roomNumber;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_type_id", referencedColumnName = "id")
    private RoomType roomType;
}
