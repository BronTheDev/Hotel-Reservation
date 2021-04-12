import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// Main class and method
class Reservation{

    public static void main(String[] args) throws Exception
    {
        // runs the form
        Form f = new Form();
    }
}

// Form layout code
class Form extends JFrame implements ActionListener {

    // Components of the form
    ArrayList<StandardRoom> rooms = new ArrayList<>();
    private int bookedRooms = 1;
    private final Container c;
    private final JLabel title;
    private final JLabel firstName;
    private final JTextField tFirstName;
    private final JLabel lastName;
    private final JTextField tLastName;
    private final JLabel roomType;
    private final JRadioButton stand;
    private final JRadioButton deluxe;
    private final JRadioButton juniorSuit;
    private final ButtonGroup roomGroup;
    private final JLabel arrival;
    private final JLabel departure;
    private final JComboBox arrivalDay;
    private final JComboBox arrivalMonth;
    private final JComboBox arrivalYear;
    private final JComboBox departureDay;
    private final JComboBox departureMonth;
    private final JComboBox departureYear;
    private final JCheckBox terms;
    private final JButton reserve;
    private final JButton Submit;
    private final JButton clear;
    private final JButton reset;
    private final JTextArea tout;
    private final JLabel res;
    private final JTextArea resadd;

    // sets days, months, years values in array
    private final String[] days
            = {"1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31"};
    private final String[] months
            = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    private final String[] years
            = {"2020", "2021", "2022",
            "2023", "2024", "2025", "2026",
            "2027", "2028", "2029", "2030",
            "2031", "2032", "2033", "2034",
            "2035", "2036", "2037"};

    // constructor to initialize the components with default values
    public Form() {
        // sets title and size of window
        setTitle("Reservation System");
        setBounds(300, 90, 1150, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        // makes a header/title
        title = new JLabel("Reservation System");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(450, 30);
        c.add(title);

        // sets first name label and a text field for user to type
        firstName = new JLabel("First Name");
        firstName.setFont(new Font("Arial", Font.PLAIN, 20));
        firstName.setSize(100, 20);
        firstName.setLocation(80, 100);
        c.add(firstName);

        tFirstName = new JTextField();
        tFirstName.setFont(new Font("Arial", Font.PLAIN, 15));
        tFirstName.setSize(190, 20);
        tFirstName.setLocation(200, 100);
        c.add(tFirstName);

        // sets last name label and a text field for user to type
        lastName = new JLabel("Last Name");
        lastName.setFont(new Font("Arial", Font.PLAIN, 20));
        lastName.setSize(100, 20);
        lastName.setLocation(80, 150);
        c.add(lastName);

        tLastName = new JTextField();
        tLastName.setFont(new Font("Arial", Font.PLAIN, 15));
        tLastName.setSize(150, 20);
        tLastName.setLocation(200, 150);
        c.add(tLastName);

        // sets room type label and three choices for user to select from
        roomType = new JLabel("Room Type");
        roomType.setFont(new Font("Arial", Font.PLAIN, 20));
        roomType.setSize(150, 20);
        roomType.setLocation(80, 200);
        c.add(roomType);

        stand = new JRadioButton("Standard");
        stand.setFont(new Font("Arial", Font.PLAIN, 15));
        stand.setSelected(true);
        stand.setSize(75, 20);
        stand.setLocation(200, 200);
        c.add(stand);

        deluxe = new JRadioButton("Deluxe");
        deluxe.setFont(new Font("Arial", Font.PLAIN, 15));
        deluxe.setSelected(false);
        deluxe.setSize(80, 20);
        deluxe.setLocation(275, 200);
        c.add(deluxe);

        juniorSuit = new JRadioButton("Junior Suite");
        juniorSuit.setFont(new Font("Arial", Font.PLAIN, 15));
        juniorSuit.setSelected(false);
        juniorSuit.setSize(105, 20);
        juniorSuit.setLocation(350, 200);
        c.add(juniorSuit);

        roomGroup = new ButtonGroup();
        roomGroup.add(stand);
        roomGroup.add(deluxe);
        roomGroup.add(juniorSuit);

        // sets arrival label and a drop down menu for user to select date
        arrival = new JLabel("Arrival");
        arrival.setFont(new Font("Arial", Font.PLAIN, 20));
        arrival.setSize(100, 20);
        arrival.setLocation(80, 250);
        c.add(arrival);

        arrivalDay = new JComboBox(days);
        arrivalDay.setFont(new Font("Arial", Font.PLAIN, 15));
        arrivalDay.setSize(75, 20);
        arrivalDay.setLocation(200, 250);
        c.add(arrivalDay);

        arrivalMonth = new JComboBox(months);
        arrivalMonth.setFont(new Font("Arial", Font.PLAIN, 15));
        arrivalMonth.setSize(100, 20);
        arrivalMonth.setLocation(275, 250);
        c.add(arrivalMonth);

        arrivalYear = new JComboBox(years);
        arrivalYear.setFont(new Font("Arial", Font.PLAIN, 15));
        arrivalYear.setSize(100, 20);
        arrivalYear.setLocation(375, 250);
        c.add(arrivalYear);

        // sets departure label and a drop down menu for user to select date
        departure = new JLabel("Departure");
        departure.setFont(new Font("Arial", Font.PLAIN, 20));
        departure.setSize(100, 20);
        departure.setLocation(80, 300);
        c.add(departure);

        departureDay = new JComboBox(days);
        departureDay.setFont(new Font("Arial", Font.PLAIN, 15));
        departureDay.setSize(75, 20);
        departureDay.setLocation(200, 300);
        c.add(departureDay);

        departureMonth = new JComboBox(months);
        departureMonth.setFont(new Font("Arial", Font.PLAIN, 15));
        departureMonth.setSize(100, 20);
        departureMonth.setLocation(275, 300);
        c.add(departureMonth);

        departureYear = new JComboBox(years);
        departureYear.setFont(new Font("Arial", Font.PLAIN, 15));
        departureYear.setSize(100, 20);
        departureYear.setLocation(375, 300);
        c.add(departureYear);

        // sets a checkbox for user to accept terms and conditions
        terms = new JCheckBox("Accept Terms and Conditions");
        terms.setFont(new Font("Arial", Font.PLAIN, 15));
        terms.setSize(250, 20);
        terms.setLocation(150, 400);
        c.add(terms);

        // sets a reserve/submit button
        reserve = new JButton("Reserve");
        reserve.setFont(new Font("Arial", Font.PLAIN, 15));
        reserve.setSize(100, 20);
        reserve.setLocation(110, 450);
        reserve.addActionListener(this);
        c.add(reserve);

        // sets a clear all button
        Submit = new JButton("Submit");
        Submit.setFont(new Font("Arial", Font.PLAIN, 15));
        Submit.setSize(100, 20);
        Submit.setLocation(230, 450);
        Submit.addActionListener(this);
        c.add(Submit);


        // sets a clear all button
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(230, 480);
        reset.addActionListener(this);
        c.add(reset);

        // sets a clear all button
        clear = new JButton("Clear");
        clear.setFont(new Font("Arial", Font.PLAIN, 15));
        clear.setSize(100, 20);
        clear.setLocation(350, 450);
        clear.addActionListener(this);
        c.add(clear);

        // sets a text area on the right to show output once reserve button is clicked
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(700, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        final JScrollPane sp = new JScrollPane(tout);
        c.add(tout);
        c.add(sp);

        //creates blank Jlabel
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
        //creates text areaa
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }


    // sets what happens when reserve & clear buttons are clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        //sets all values back to default and clears text from display
        if (e.getSource() == clear) {
            String empty = "";
            tFirstName.setText(empty);
            tLastName.setText(empty);
            res.setText(empty);
            tout.setText(empty);
            terms.setSelected(false);
            arrivalDay.setSelectedIndex(0);
            arrivalMonth.setSelectedIndex(0);
            arrivalYear.setSelectedIndex(0);
            departureDay.setSelectedIndex(0);
            departureMonth.setSelectedIndex(0);
            departureYear.setSelectedIndex(0);
            resadd.setText(empty);

        }
        if (e.getSource() == reserve) {
            //Calls for button to not execute unless rooms are available
            if(bookedRooms <= 6) {

                //Makes sure that hotel room can not be reserved unless stay is at least over one day
                if(arrivalDay.getSelectedIndex() < departureDay.getSelectedIndex() || arrivalMonth.getSelectedIndex() < departureMonth.getSelectedIndex() || arrivalYear.getSelectedIndex()<departureYear.getSelectedIndex()) {
                    //executes when standard room is being reserved
                    if (stand.isSelected()) {
                        StandardRoom room = new StandardRoom();
                        room.setPerson_Name(tFirstName.getText() + " " + tLastName.getText());
                        room.reserveRoom(bookedRooms);
                        room.setArrive_Date(arrivalMonth.getSelectedItem().toString() + "|" + arrivalDay.getSelectedItem().toString() + "|" + arrivalYear.getSelectedItem().toString());
                        room.setDepart_Date(departureMonth.getSelectedItem().toString() + "|" + departureDay.getSelectedItem().toString() + "|" + departureYear.getSelectedItem().toString());
                        tout.setText(tout.getText() + room.toString());
                        rooms.add(room);
                        tout.setEditable(false);
                        bookedRooms += 1;
                    }

                    //executes when Deluxe Suite is being reserved
                    if (deluxe.isSelected()) {
                        DeluxeRoom room = new DeluxeRoom(); //instantiates deluxe room object
                        room.setPerson_Name(tFirstName.getText() + " " + tLastName.getText()); // initializes guests name from the text box input
                        room.reserveRoom(bookedRooms); // calls reserveRoom method

                        //Concatenates all date values into one arrival date.
                        room.setArrive_Date(arrivalMonth.getSelectedItem().toString() + "|" + arrivalDay.getSelectedItem().toString() + "|" + arrivalYear.getSelectedItem().toString());
                        //Concatenates all date values into one departure date.
                        room.setDepart_Date(departureMonth.getSelectedItem().toString() + "|" + departureDay.getSelectedItem().toString() + "|" + departureYear.getSelectedItem().toString());
                        tout.setText(tout.getText() + room.toString()); //displays text onto textfield
                        rooms.add(room); //add room into arraylist
                        bookedRooms += 1; //increments amount of booked rooms


                    }
                    //executes when Junior Suite is being reserved
                    if (juniorSuit.isSelected()) {
                        JuniorRoom room = new JuniorRoom();
                        room.setPerson_Name(tFirstName.getText() + " " + tLastName.getText());
                        room.reserveRoom(bookedRooms);
                        room.setArrive_Date(arrivalMonth.getSelectedItem().toString() + "|" + arrivalDay.getSelectedItem().toString() + "|" + arrivalYear.getSelectedItem().toString());
                        room.setDepart_Date(departureMonth.getSelectedItem().toString() + "|" + departureDay.getSelectedItem().toString() + "|" + departureYear.getSelectedItem().toString());
                        tout.setText(tout.getText() + room.toString());
                        tout.setEditable(false);
                        rooms.add(room);
                        bookedRooms += 1;
                    }
                }
            }
            else {
                tout.setText(tout.getText() + System.lineSeparator() +"We are sorry for the inconvenience but, all rooms are currently sold out. \n Please contact the front desk or call (336)-345-4249 for more information \n");
            }

        }
        if (e.getSource() == reset){
            rooms.clear();
            bookedRooms = 1;
        }
        if (e.getSource() == Submit) {
            int total = 0;
            for (StandardRoom room : rooms) {
                total += room.getFinalCost();
            }
            tout.setText(tout.getText() + System.lineSeparator() +
                    System.lineSeparator() +
                    System.lineSeparator() + "Thank you for staying at the Hilton Garden Inn. Your total for today will come up to $" + total + System.lineSeparator() +
                    "Thank you for choosing the Hilton and we hope you enjoy your stay. \n");
            total = 0;


        }
    }
    }

