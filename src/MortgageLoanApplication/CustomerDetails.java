package MortgageLoanApplication;

public class CustomerDetails {
    private String customerId;
    private String name;
    private String phoneNumber;
    private String emailId;

    public CustomerDetails(String customerId, String name, String phoneNumber, String emailId) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    void displayCustomerDetails(){
        System.out.println("===========Customer Details==========");
        System.out.println("Customer Id:"+getCustomerId());
        System.out.println("Name       :"+getName());
        System.out.println("PhoneNumber:"+getPhoneNumber());
        System.out.println("Email Id   :"+getEmailId());


    }

}

