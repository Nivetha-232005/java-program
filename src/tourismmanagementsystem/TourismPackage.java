package tourismmanagementsystem;

 abstract public class TourismPackage {

     private String packageId;
     private String destination;
     private int numberOfDays;
     private int numberOfTravelers;
     private double basePrice;

     public TourismPackage(String packageId, String destination, int numberOfDays, int numberOfTravelers, double basePrice) {
         this.packageId = packageId;
         this.destination = destination;
         this.numberOfDays = numberOfDays;
         this.numberOfTravelers = numberOfTravelers;
         this.basePrice = basePrice;
     }

     public String getPackageId() {
         return packageId;
     }

     public String getDestination() {
         return destination;
     }

     public int getNumberOfDays() {
         return numberOfDays;
     }

     public int getNumberOfTravelers() {
         return numberOfTravelers;
     }

     public double getBasePrice() {
         return basePrice;
     }
         double calculateDiscount(){
             {
                 if (getNumberOfDays() >= 10) {
                     return getBasePrice() * 0.10;
                 }
                 else if (getNumberOfDays() >= 5) {
                     return getBasePrice() * 0.05;
                 }
                 else {
                     return 0;
                 }
             }
         }

     void displayPackageDetails() {
         System.out.println("Package ID   :" + getPackageId());
         System.out.println("Destination  :" + getDestination());
         System.out.println("Days         :" + getNumberOfDays());
         System.out.println("Travelers    :" + getNumberOfTravelers());
         System.out.println("Base Price   : " + getBasePrice());
         System.out.println("Discount     : "+calculateDiscount());
     }

     public abstract double calculateFinalPrice();

 }
     class DomesticTourism extends TourismPackage {
         private double finalPrice;
         private double serviceCharge = 0.05;

         public DomesticTourism(String packageId, String destination, int numberOfDays, int numberOfTravelers, double basePrice, double finalPrice) {
             super(packageId, destination, numberOfDays, numberOfTravelers, basePrice);
             this.finalPrice = finalPrice;
         }

         public double getFinalPrice() {
             return finalPrice;
         }

         public double getServiceCharge() {
             return serviceCharge;
         }

         @Override
         public double calculateFinalPrice() {
             super.displayPackageDetails();
             System.out.println("Package Type : Domestic Tourism");
             System.out.println("Final Prices:"+getFinalPrice());
             finalPrice = getBasePrice() * getServiceCharge();
             return finalPrice;
         }
    void domesticTourism(){
             super.displayPackageDetails();
    System.out.println("Package Type : Domestic Tourism");
    System.out.println("Final Prices:"+getFinalPrice());
         }

     }
class InternationalTourism extends TourismPackage {
    private double finalPrice;
    private double serviceCharge = 0.10;
    private double tax=0.08;

    public InternationalTourism(String packageId, String destination, int numberOfDays, int numberOfTravelers, double basePrice, double finalPrice) {
        super(packageId, destination, numberOfDays, numberOfTravelers, basePrice);
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public double calculateFinalPrice() {
        super.displayPackageDetails();
        System.out.println("Package Type : Domestic Tourism");
        System.out.println("Final Prices:"+getFinalPrice());
        finalPrice =(getBasePrice() * getServiceCharge())+getTax();
        return finalPrice;
    }
    void internationalTourism(){
        super.displayPackageDetails();
        System.out.println("Package Type : Domestic Tourism");
        System.out.println("Final Prices:"+getFinalPrice());
    }

}
class AdventureTourism extends TourismPackage {
    private double finalPrice;
    private double adventureCharge = 0.15;

    public AdventureTourism(String packageId, String destination, int numberOfDays, int numberOfTravelers, double basePrice, double finalPrice) {
        super(packageId, destination, numberOfDays, numberOfTravelers, basePrice);
        this.finalPrice = finalPrice;
    }

    @Override
    public double calculateFinalPrice() {
        super.displayPackageDetails();
        System.out.println("Package Type : AdventureTourism");
        System.out.println("Final Prices:"+finalPrice);
        finalPrice = getBasePrice() + adventureCharge;
        return finalPrice;
    }

}

class LuxuryTourism extends TourismPackage {
    private double finalPrice;
    private double luxuryCharge = 0.2;

    public LuxuryTourism(String packageId, String destination, int numberOfDays, int numberOfTravelers, double basePrice, double finalPrice) {
        super(packageId, destination, numberOfDays, numberOfTravelers, basePrice);
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getLuxuryCharge() {
        return luxuryCharge;
    }

    public double calculateFinalPrice() {
        super.displayPackageDetails();
        System.out.println("Package Type : Luxury Tourism");
        System.out.println("Final Price : " + getFinalPrice());
        finalPrice = getBasePrice() * getLuxuryCharge();
        return finalPrice;
    }


}
