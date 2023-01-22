package com.hotel.reservation.repository;


import com.hotel.reservation.entity.RoomType;
import com.hotel.reservation.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
}
