
package tourismmanagementsystem;

public class Tourist {


    private String touristId;
    private String touristName;
    private String email;
    private String phone;


    public Tourist() {
        System.out.println("========================================\n" +
                           "       NIVETHATOUR TRAVELS\n" +
                           "========================================");
    }


    public Tourist(String touristId, String touristName, String email, String phone) {
        this.touristId = touristId;
        this.touristName = touristName;
        this.email = email;
        this.phone = phone;
    }


    public String getTouristId() {
        return touristId;
    }

    public String getTouristName() {
        return touristName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void displayTourist() {
        System.out.println("Tourist Details");
        System.out.println();
        System.out.println("Tourist ID    : " + getTouristId());
        System.out.println("Tourist Name  : " + getTouristName());
        System.out.println("Email         : " + getEmail());
        System.out.println("Phone         : " + getPhone());
    }
}
