package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Booking;

public interface IBookingDAO  extends JpaRepository<Booking, Long>{

}
