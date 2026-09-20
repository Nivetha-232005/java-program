package tourismmanagementsystem;
import java.time.LocalDate;
public class TourismManagementApp {
        public static void main(String[] args) {

            Tourist tourist=new Tourist();
            Tourist tourist1 = new Tourist("T101", "Arun", "arun@gmail.com", "9876543210");
            Tourist tourist2 = new Tourist("T102", "Nivetha","nivetha@gmail.com", "9876543210");
            tourist1.displayTourist();
            System.out.println();
            tourist2.displayTourist();

            System.out.println("===================================================================");
            TourismPackage package1 = new DomesticTourism("TP101", "Goa", 4, 2, 40000.0, 42000.0);
            package1.calculateFinalPrice();
            System.out.println("====================================================================");
            TourismPackage package2 = new InternationalTourism("TP102", "Paris", 7, 2, 100000.0, 118000.0);
            package2.displayPackageDetails();
            System.out.println("====================================================================");
            TourismPackage package3 = new AdventureTourism("TP103", "Manali", 6, 3, 60000.0, 69000.0);
            package3.displayPackageDetails();
            System.out.println("====================================================================");
            TourismPackage package4 = new LuxuryTourism("TP104", "Dubai", 10, 2, 80000.0,88000.0);
            package4.displayPackageDetails();
            System.out.println("====================================================================");
            Booking booking = new Booking("B001", tourist1, package1, LocalDate.now());
            System.out.println("Booking Id     :"+ booking.getBookingId());
            System.out.println("Tourist Name   :"+booking.getTourist().getTouristName());
            System.out.println("Tourism Package:"+booking.getTourismPackage().getDestination());
            System.out.println("bookingDate    :"+booking.getBookingDate());
        }
    }

