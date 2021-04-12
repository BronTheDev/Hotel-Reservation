import java.util.Arrays;

// class for stand room
public class StandardRoom {
    // initialize customer name, arrival, departure, and room number
    public String person_Name;
    public String arrive_Date;
    public String depart_Date;
    private int roomNumber;
    // standard has a queen bed, and costs 120/night
    public boolean queenBed;
    private final int cost = 120;
    private int finalCost;


    //No args constructor that initializes variables
    public StandardRoom() {
        setPerson_Name("");
        setArrive_Date("");
        setDepart_Date("");
        setRoomNumber(0);
        queenBed = true;
    }

    //Overloaded Constructor that sets values for instantiated objects
    public StandardRoom(String person_Name, String arrive_Date, String depart_Date) {
        this.setPerson_Name(person_Name);
        this.setArrive_Date(arrive_Date);
        this.setDepart_Date(depart_Date);
    }

    //Method that is called for when a room is reserved
    public java.lang.Integer reserveRoom(int roomNumber) {
        if (roomNumber > 6) {
            System.out.println("Rooms Sold Out.");
        } else {
            setRoomNumber(roomNumber);
            return getRoomNumber();
        }
        return null;
    }
    // calculates the number of days the customer is staying
    public int findStayLength(String date1, String date2) {
        // turns arrival and departure dates into arrays
        String[] arrival = date1.split("\\|");
        String[] departure = date2.split("\\|");

        // takes second element(month) of the arrays and stores it in variables
        String arrivalMonth = arrival[0];
        String departureMonth = departure[0];
        // if customer is arriving and leaving in the same month, just subtract the number of days
        if (arrivalMonth.equals(departureMonth))
            return Integer.parseInt(departure[1]) - Integer.parseInt(arrival[1]);
        // if not, represent months as integers for both arrival and departure
        int num = 0;
        switch (arrivalMonth) {
            case "Jan":
                    num = 1;
                    break;
                case "Feb":
                    num = 2;
                    break;
                case "Mar":
                    num = 3;
                    break;
                case "Apr":
                    num = 4;
                    break;
                case "May":
                    num = 5;
                    break;
                case "Jun":
                    num = 6;
                    break;
                case "July":
                    num = 7;
                    break;
                case "Aug":
                    num = 8;
                    break;
                case "Sep":
                    num = 9;
                    break;
                case "Oct":
                    num = 10;
                    break;
                case "Nov":
                    num = 11;
                    break;
                case "Dec":
                    num = 12;
                    break;
            }
            int num2 = 0;
            switch (departureMonth) {
                case "Jan":
                    num2 = 1;
                    break;
                case "Feb":
                    num2 = 2;
                    break;
                case "Mar":
                    num2 = 3;
                    break;
                case "Apr":
                    num2 = 4;
                    break;
                case "May":
                    num2 = 5;
                    break;
                case "Jun":
                    num2 = 6;
                    break;
                case "July":
                    num2 = 7;
                    break;
                case "Aug":
                    num2 = 8;
                    break;
                case "Sep":
                    num2 = 9;
                    break;
                case "Oct":
                    num2 = 10;
                    break;
                case "Nov":
                    num2 = 11;
                    break;
                case "Dec":
                    num2 = 11;
                    break;
            }
            int days = 0;
            // until the arrival month passes the departure month
            while (num < num2) {
                // add the days between two months
                days += (31 - Integer.parseInt(arrival[1])) + Math.abs(Integer.parseInt(departure[1]));
                // increase months
                num++;
            }
            // return number of days
            return days;


    }
    // gets total cost of stay
    public int totalCost() {
        // calls above method to get number of days
       int days = findStayLength(getArrive_Date(), getDepart_Date());
       // multiplies the days by how much the room cost
       setFinalCost(days*getCost());
       // returns the cost
       return (days*getCost());
    }


    //To string method that displays prints details of the object
    @Override
    public String toString() {
        return "Guest Name: " + getPerson_Name() + ", CheckIn: " + getArrive_Date() + ", CheckOut: " + getDepart_Date() + ", Room#: " + getRoomNumber() + ", Cost: " + totalCost() + System.lineSeparator();
    }

    //Object Getters and Setters
    public String getPerson_Name() {
        return person_Name;
    }

    public void setPerson_Name(String person_Name) {
        this.person_Name = person_Name;
    }

    public String getArrive_Date() {
        return arrive_Date;
    }

    public void setArrive_Date(String arrive_Date) {
        this.arrive_Date = arrive_Date;
    }

    public String getDepart_Date() {
        return depart_Date;
    }

    public void setDepart_Date(String depart_Date) {
        this.depart_Date = depart_Date;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCost() {
        return cost;
    }

    public int getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(int finalCost) {
        this.finalCost = finalCost;
    }
}