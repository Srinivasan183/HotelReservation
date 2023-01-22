package com.hotel.reservation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {

    private Integer id;

    private Integer userId;

    private Integer roomNumber;

    private LocalDate bookedDate;

    private LocalDate fromDate;

    private LocalDate toDate;

    private LocalDate updatedDate;

}
