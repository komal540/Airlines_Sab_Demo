package main.java.com.komal.airlineSab.dao;

import java.util.List;

import main.java.com.komal.airlineSab.entity.BookingRecord;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDao extends JpaRepository<BookingRecord, Long>{
	
	
	@Query( nativeQuery = true,  value = "select * from booking_record br where br.booking_id= 181")
	List<BookingRecord> getBookingRecordsByUserId(long userId);
	
	@EntityGraph(attributePaths = { "passengers" })
	BookingRecord findByBookingId(long bookingId);

}
