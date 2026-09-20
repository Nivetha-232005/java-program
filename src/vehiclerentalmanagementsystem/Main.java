package vehiclerentalmanagementsystem;

public class Main {

    public static void main(String[] args) {


        Vehicle car = new Car("BE-123-ABC", "Toyota", "Corolla", 50);
        Vehicle bike = new Bike("BE-456-BIKE", "Yamaha", "R15", 30);
        Vehicle truck = new Truck("BE-789-TRK", "Volvo", "FH", 100);
        Address address = new Address("12", "Main Street", "ayyampalayam", "624202");
        Customer customer = new Customer("C101", "nivetha", "9876543210", address);
        Rental rental = new Rental("R101", 4, customer, car);
        rental.displayVehicleDetails();

        System.out.println("\n========================================");
        System.out.println("        RELATIONSHIP DEMONSTRATION");
        System.out.println("========================================");

        System.out.println("Car IS-A Vehicle");
        System.out.println("Bike IS-A Vehicle");
        System.out.println("Truck IS-A Vehicle");

        System.out.println("Customer HAS-A Address");
        System.out.println("Rental HAS-A Customer");
        System.out.println("Rental HAS-A Vehicle");

    }
}
