package com.hotel.reservation.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomsRequest implements Serializable {

    private String roomNumber;

    private Integer roomType;
}
