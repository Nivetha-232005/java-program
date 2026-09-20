package tourismmanagementsystem;
import java.time.LocalDate;

public class Booking {
    private final String bookingId;
    private final Tourist tourist;
    private final TourismPackage tourismPackage;
    private final LocalDate bookingDate;

    public Booking(String bookingId, Tourist tourist,
                   TourismPackage tourismPackage,
                   LocalDate bookingDate) {

        this.bookingId = bookingId;
        this.tourist = tourist;
        this.tourismPackage = tourismPackage;
        this.bookingDate = bookingDate;
    }


    public String getBookingId() {
        return bookingId;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public TourismPackage getTourismPackage() {
        return tourismPackage;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

}

