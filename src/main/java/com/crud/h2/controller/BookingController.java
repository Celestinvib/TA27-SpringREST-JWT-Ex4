package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Booking;
import com.crud.h2.service.BookingServiceImpl;

@RestController
@RequestMapping("/api")
public class BookingController {
	@Autowired
	BookingServiceImpl bookingServiceImpl;
	
	@GetMapping("/reservas")
	public List<Booking> listBookings(){
		return bookingServiceImpl.listBookings();
	}
	
	@PostMapping("/reservas")
	public Booking saveBooking(@RequestBody Booking booking) {
		
		return bookingServiceImpl.saveBooking(booking);
	}
	
	@GetMapping("/reservas/{id}")
	public Booking itemXID(@PathVariable(name="id") Long id) {
		
		Booking booking_xid= new Booking();
		
		booking_xid= bookingServiceImpl.bookingXID(id);
		
		System.out.println("Reserva XID: "+booking_xid);
		
		return booking_xid;
	}
	
	@PutMapping("/reservas/{id}")
	public Booking updateBooking(@PathVariable(name="id")Long id,@RequestBody Booking booking) {
		
		Booking bookingSelected= new Booking();
		Booking bookingUpdated = new Booking();
		
		bookingSelected= bookingServiceImpl.bookingXID(id);;
		
		bookingSelected.setInvestigator(booking.getInvestigator());
		bookingSelected.setTeam(booking.getTeam());
		bookingSelected.setBeginning(booking.getBeginning());
		bookingSelected.setEnd(booking.getEnd());
		
	
		bookingUpdated = bookingServiceImpl.updateBooking(bookingSelected);
		
		System.out.println("La reserva actualizada es: "+ bookingUpdated);
		
		return bookingUpdated;
	}
	
	@DeleteMapping("/reservas/{id}")
	public void deleteBooking(@PathVariable(name="id")Long id) {
		bookingServiceImpl.deleteBooking(id);
	}	

}
