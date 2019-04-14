package Assignment;


public class EmployeeID {

    public String eTitle;
    public String eName;
    public String eSname;
    public String eDOB;
    public String eAddress;
    public String eTown;
    public String eCounty;
    public String ePostcode;
    public String eCnumber;
    public String eEmail;
    public int employeeID;
    public String ePosition;
    public String eStartDate;


    public EmployeeID (int ID, String title, String name, String surname, String dob, String address, String town, String county, String postcode,
                       String number,
             String email , String position, String startdate) {
        this.eTitle = title;
        this.eName = name;
        this.eSname = surname;
        this.eDOB = dob;
        this.eAddress = address;
        this.eTown = town;
        this.eCounty = county;
        this.ePostcode = postcode;
        this.eCnumber = number;
        this.eEmail = email;
        this.employeeID = ID;
        this.ePosition = position;
        this.eStartDate = startdate;

    }

}



