package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.Reservation;
import com.hotel.reservation.repository.ReservationRepository;
import com.hotel.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservation() {
        return this.reservationRepository.findAll();
    }

    @Override
    public Reservation reserveRoom(Reservation reservation) {
        return this.reservationRepository.save(reservation);
    }

    @Override
    public Optional<Reservation> getReservedRoomById(int reservationId) {
        return this.reservationRepository.findById(reservationId);
    }
}
