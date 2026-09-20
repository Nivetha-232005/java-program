import java.util.Scanner;

class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi ,Welcome  for booking our movies Ticket :\n");
        System.out.println("Available movies\n");
        System.out.println(

                "1. Leo\n" +
                        "   Rating: 4\n" +
                        "   Language: Tamil\n" +
                        "\n" +
                        "2. jobs\n" +
                        "   Rating: 5\n" +
                        "   Language: English\n" +

                        "\n" +
                        "3. Avatar\n" +
                        "   Rating: 4.5\n" +
                        "   Language: English\n" +

                        "\n" +
                        "4. Jawan\n" +
                        "   Rating: 3\n" +
                        "   Language: Hindi\n");
        System.out.print("Select the movies:");

        int movieName = sc.nextInt();
        switch (movieName) {

            case 1:
                System.out.println("Leo\n" + "movie Timeing :\n 1. 10.00 am\n 2. 1.00 pm\n 3. 4.00 pm\n "
                        + "Available Ticket:10\n");

                break;
            case 2:
                System.out.println(" Interstellar\n" + "movie Timeing :\n 1. 10.00 am\n 2. 1.00 pm\n 3. 4.00 pm\n "
                        + "Available Ticket:12\n");

                break;

            case 3:
                System.out.println("Avatar\n" + "movie Timeing\n 1. 10.00 am\n 2. 1.00 pm\n 3. 4.00 pm\n "
                        + "Available Ticket:15\n");
                break;
            case 4:
                System.out.println("Jawan\n" + "movie Timeing\n 1. 10.00 am\n 2. 1.00 pm\n 3. 4.00 pm\n "
                        + "Available Ticket:15\n");
                break;
            default:
                System.out.println("The movie is not Available");

                return;
        }
        System.out.print("select the show time:");
        int movieTime = sc.nextInt();
        switch (movieTime) {
            case 1:
                System.out.println("you are select the time in 10.00 am");
                break;
            case 2:
                System.out.println("you are select the time in 1.00 pm");
                break;
            case 3:
                System.out.println("you are select the time in 4.00 pm");
                break;
            default:
                System.out.println("That time is not available in any show.so, please select available time");
                return;

        }

        System.out.print("Enter the number of ticket:");
        int n = sc.nextInt();
        System.out.println("\nMovieHall:AC=300 or NON-AC=200");
        String MovieHall = sc.next();
        if (MovieHall.equalsIgnoreCase("\nAC")) {
            System.out.println(" you selected ACHall");
        } else if (MovieHall.equalsIgnoreCase("\nNON-AC")) {
            System.out.println("\nyou select the NON-ACHall");

        }
        int NonAcTicketPrice = 200;
        int AcTicketPrice = 300;
        if (MovieHall.equalsIgnoreCase("NonAC")) {
            System.out.println("you are selected in NonACHall");
            System.out.println("NonAc Hall Ticketprice = 200");
            System.out.println("Number  of ticket:" + n);

            int NonAcHallTotalamount = NonAcTicketPrice * n;
            System.out.println("Totalamount  :" + NonAcHallTotalamount);

        } else if (MovieHall.equalsIgnoreCase("AC")) {
            System.out.println("you are selected in ACHall");
            System.out.println("Ac Hall Ticketprice = 300");
            System.out.println("Number  of ticket:" + n);

            int AcHallTotalamount = AcTicketPrice * n;
            System.out.println("Totalamount  :" + AcHallTotalamount);


        }

        System.out.println("Select the Payment method:\n"
                + "UPI" + " " + "Card");

        String Paymentmethod = sc.next();

        if (Paymentmethod.equalsIgnoreCase("UPI")) {
            System.out.print("Enter the upiId:");
            String Upiid = sc.next();
            if (Upiid.contains("@")) {
                System.out.println("valid upi id");
                System.out.println("Amount Transfer Successful");
            } else {
                System.out.println("invalid upi id");
            }

        } else if (Paymentmethod.equalsIgnoreCase("card")) {
            System.out.print("\nEnter the pin :");
            int Cardpin = sc.nextInt();

            if (Cardpin == 1234) {
                System.out.println("\nvalid pin ");
                System.out.println("       Amount Transfer Successful      ");
            } else {
                System.out.println("invalid pin");
                return;
            }
        } else {

            System.out.println("This  payment method is invalid\n");
            return;
        }

        System.out.println(" " + "       BOOKING CONFIRMED     " + " ");
        switch (movieName) {

            case 1:
                System.out.println("Movie name:Leo");

                break;
            case 2:
                System.out.println("jobs");

                break;

            case 3:
                System.out.println("Movie name:Avatar");
                break;
            case 4:
                System.out.println("Movie name:Jawan");
                break;
        }
        if (movieTime == 1) {
            System.out.println("Movie Time:10.00am");
        } else if (movieTime == 2) {
            System.out.println("Movie Time:1.00pm");

        } else {
            System.out.println("Movie Time:4.00pm");
        }
        System.out.println("MovieHall:" + MovieHall);
        System.out.println("Tickets :" + n);
        if (MovieHall.equalsIgnoreCase("AC")) {
            System.out.println("ACHall price:300");
            System.out.println("Totalprice:" + AcTicketPrice * n);
        } else if (MovieHall.equalsIgnoreCase("NonAC")) {
            System.out.println("NonACHall price:200");
            System.out.println("Totalprice:" + NonAcTicketPrice * n);
        }


    }


}













