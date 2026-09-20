package vehiclerentalmanagementsystem;

/**
 *
 * @author nivetha
 * @version 1.0
 */
 public class Vehicle {
     private final String vehicleNumber;
     private final String brand;
     private final String model;
     private final int rentPerDay;

    /**
     * hi constructor vehicle
     * @param vehicleNumber the vehicle number
     * @param brand brand
     * @param model modle
     * @param rentPerDay rent per day
     * hi
     */
     public Vehicle(String vehicleNumber, String brand, String model, int rentPerDay) {
         this.vehicleNumber = vehicleNumber;
         this.brand = brand;
         this.model = model;
         this.rentPerDay = rentPerDay;

     }

    /**
     * getVehicleNumber
     * @return vehicle number
     */

     public String getVehicleNumber() {
         return vehicleNumber;
     }

    /**
     * brand
     * @return brand
     */

     public String getBrand() {
         return brand;
     }

    /**
     * modle
     * @return modle
     */
     public String getModel() {
         return model;
     }
    /**
     * rent
     * @return rentPerDay
     */

     public int getRentPerDay() {
         return rentPerDay;
     }

      void displayVehicleDetails(){

     }

 }

/**
 *hi i am car
 * @see Vehicle
 */
class Car extends Vehicle{
    /**
     * constructor car
     * @param vehicleNumber
     * @param brand
     * @param model
     * @param rentPerDay
     */

    public Car(String vehicleNumber, String brand, String model, int rentPerDay) {
        super(vehicleNumber, brand, model, rentPerDay);
    }


    void displayVehicleDetails(){
        System.out.println("Vehicle Type  : Car");

             System.out.println("vehicle no:"+getVehicleNumber());
             System.out.println("brand:"+getBrand());
             System.out.println("Model:"+getModel());
             System.out.println("Rent per day:"+getRentPerDay());
         }
    }
/**
 *hi  am bike
 * @see Vehicle
 */
     class Bike extends Vehicle{

    /**
     * constructor bike
     * @param vehicleNumber
     * @param brand
     * @param model
     * @param rentPerDay
     */
         public Bike(String vehicleNumber, String brand, String model, int rentPerDay) {
             super(vehicleNumber, brand, model, rentPerDay);
         }

         void displayVehicleDetails(){
             System.out.println("Vehicle Type  : Bike");

             System.out.println("vehicle number:"+getVehicleNumber());
             System.out.println("brand         :"+getBrand());
             System.out.println("Model         :"+getModel());
             System.out.println("Rent per day  :"+getRentPerDay());
         }
     }
/**
 *hi  am truck
 * @see Vehicle
 */
     class Truck extends Vehicle{

    /**
     * constructor truck
     * @param vehicleNumber
     * @param brand
     * @param model
     * @param rentPerDay
     */
         public Truck(String vehicleNumber, String brand, String model, int rentPerDay) {
             super(vehicleNumber, brand, model, rentPerDay);
         }

         void displayVehicleDetails(){
             System.out.println("Vehicle Type  : Truck");

             System.out.println("vehicle number :"+getVehicleNumber());
             System.out.println("brand          :"+getBrand());
             System.out.println("Model          :"+getModel());
             System.out.println("Rent per day   :"+getRentPerDay());
         }
     }

/**
 * class address
 */
class Address {
    /**
     * houseNumber
     */
    private String houseNumber;
    private String street;
    private String city;
    private String pinCode;

    public Address(String houseNumber, String street,
                   String city, String pinCode) {

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
    }

    public void displayVehicleDetails() {

        System.out.println("House Number  : " + houseNumber);
        System.out.println("Street        : " + street);
        System.out.println("City          : " + city);
        System.out.println("pin code  : " + pinCode);
    }
}


/**
 * class custour
 */
class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;

    // Customer HAS-A Address
    private Address address;

    public Customer(String customerId, String customerName,
                    String phoneNumber, Address address) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayVehicleDetails() {

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);

        System.out.println("\nAddress Details");
        address.displayVehicleDetails();
    }
}

/**
 * rental
 */


class Rental {

    private String rentalId;
    private int rentalDays;

    // Rental HAS-A Customer
    private Customer customer;

    // Rental HAS-A Vehicle
    private Vehicle vehicle;

    public Rental(String rentalId, int rentalDays, Customer customer, Vehicle vehicle)
    {

        this.rentalId = rentalId;
        this.rentalDays = rentalDays;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    /**
     *rental amount
     * @return rental amount
     */
    public double displayRentalDetails(){

        return vehicle.getRentPerDay() * rentalDays;
    }

    public void displayVehicleDetails(){

        System.out.println("\n========================================");
        System.out.println("       VEHICLE RENTAL MANAGEMENT");
        System.out.println("========================================");

        System.out.println("\nRental ID     : " + rentalId);
        System.out.println("Rental Days     : " + rentalDays);

        System.out.println("\nCustomer Details");
        customer.displayVehicleDetails();

        System.out.println("\nVehicle Details");
        vehicle.displayVehicleDetails();

        System.out.println("\nTotal Amount   : €" + displayRentalDetails());
    }
}



