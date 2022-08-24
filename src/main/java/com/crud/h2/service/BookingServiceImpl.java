package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IBookingDAO;
import com.crud.h2.dto.Booking;

@Service
public class BookingServiceImpl implements IBookingService {
	//We use the methods of the IItemDAO interface, it is as if we were instantiating.
	@Autowired
	IBookingDAO iBookingDAO;
	
	@Override
	public List<Booking> listBookings() {
		
		return iBookingDAO.findAll();
	}

	@Override
	public Booking saveBooking(Booking booking) {
		return iBookingDAO.save(booking);
	}

	@Override
	public Booking bookingXID(Long id) {
		return iBookingDAO.findById(id).get();
	}

	@Override
	public Booking updateBooking(Booking booking) {
		return iBookingDAO.save(booking);
	}

	@Override
	public void deleteBooking(Long id) {
		iBookingDAO.deleteById(id);		
	}
}
