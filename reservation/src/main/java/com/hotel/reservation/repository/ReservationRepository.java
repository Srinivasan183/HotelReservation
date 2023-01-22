package com.hotel.reservation.repository;


import com.hotel.reservation.entity.Reservation;
import com.hotel.reservation.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
