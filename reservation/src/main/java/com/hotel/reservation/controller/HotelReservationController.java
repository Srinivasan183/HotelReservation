package com.hotel.reservation.controller;

import com.hotel.reservation.dto.request.ReservationRequest;
import com.hotel.reservation.dto.response.ReservationResponse;
import com.hotel.reservation.entity.Reservation;
import com.hotel.reservation.mapper.ReservationMapper;
import com.hotel.reservation.service.ReservationService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Api(value = "Reservation resources")
@Slf4j
@RestController
@RequestMapping("/api/reservation")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HotelReservationController {

    private final ReservationService reservationService;

    private final ReservationMapper reservationMapper;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ReservationResponse>> getAllReservation() {
        List<ReservationResponse> reservationResponses = this.reservationMapper.mapRequests(
                this.reservationService.getAllReservation());
        return new ResponseEntity<>(reservationResponses, HttpStatus.OK);
    }

    @GetMapping(path ="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> getReservationById(@PathVariable Integer id) {
        Optional<Reservation> reservation = this.reservationService.getReservedRoomById(id);
        ReservationResponse reservationResponse;
        if (reservation.isPresent()) {
            reservationResponse = this.reservationMapper.mapRequest(reservation.get());
            return new ResponseEntity<>(reservationResponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> reserveHotelRoom(@RequestBody ReservationRequest reservationRequest) {
        Reservation reservation = this.reservationMapper.mapEntity(reservationRequest);
        ReservationResponse reservationResponse = this.reservationMapper.mapRequest(this.reservationService.reserveRoom(reservation));
        return new ResponseEntity<>(reservationResponse, HttpStatus.OK);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(@RequestBody ReservationRequest reservationRequest) {
        Reservation reservation = this.reservationMapper.mapEntity(reservationRequest);
        ReservationResponse reservationResponse = this.reservationMapper.mapRequest(this.reservationService.reserveRoom(reservation));
        return new ResponseEntity<>(reservationResponse, HttpStatus.OK);
    }
}
