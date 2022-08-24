package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Booking;

public interface IBookingService {
		//CRUD methods
		public List<Booking> listBookings(); //List All 
		
		public Booking saveBooking(Booking booking);//Save a new booking "CREATE"
		
		public Booking bookingXID(Long id); //Read data from a booking "READ"
				
		public Booking updateBooking(Booking booking); //Update booking data "UPDATE"
		
		public void deleteBooking(Long id);// Delete a booking via id "DELETE"
}
