package com.hotel.reservation.controller;

import com.hotel.reservation.entity.Reservation;
import com.hotel.reservation.service.ReservationService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Reservation resources")
@Slf4j
@RestController
@RequestMapping("/api/reservation")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HotelReservationController {

    private final ReservationService reservationService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reservation> getAllReservation() {
        return this.reservationService.getAllReservation();
    }

    @GetMapping(path ="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Reservation getReservationById(@PathVariable Integer id) {
        return this.reservationService.getReservedRoomById(id).orElse(new Reservation());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> reserveHotelRoom() {
        return null;
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> updateReservation() {
        return null;
    }
}
