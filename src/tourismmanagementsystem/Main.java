package tourismmanagementsystem;

public class Main {
    public static void main(String[] args) {
        TourismPackage package1 = new DomesticTourism("TP101", "Goa", 5, 2, 40000.0,  42000.0);
        System.out.print("Final Price: " + package1.calculateFinalPrice());
        TourismPackage package2 = new InternationalTourism("TP102", "Paris", 7, 2, 100000.0,118000.0);
        System.out.print("Final Price: " + package2.calculateFinalPrice());
        TourismPackage package3 = new AdventureTourism("TP103", "Manali", 6, 3, 60000.0,69000.0);
        System.out.print("Final Price: " + package3.calculateFinalPrice());
    }
    }


