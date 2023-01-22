package com.hotel.reservation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResponse {

    private Integer id;

    private UserDetailsResponse userId;

    private RoomsResponse roomNumber;

    private LocalDate bookedDate;

    private LocalDate fromDate;

    private LocalDate toDate;

    private LocalDate updatedDate;

}
