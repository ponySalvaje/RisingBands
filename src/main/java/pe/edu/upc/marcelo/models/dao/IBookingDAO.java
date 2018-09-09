package pe.edu.upc.marcelo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.marcelo.models.entity.Booking;

@Repository
public interface IBookingDAO extends JpaRepository<Booking, Long> {
	
}
