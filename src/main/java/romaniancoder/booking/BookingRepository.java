package romaniancoder.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IMC021 on 2017. 7. 26..
 */
@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {
    List<HotelBooking> findByPricePerNightLessThan(double price);
}
