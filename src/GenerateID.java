import java.util.Random;
// generates a random ID
public class GenerateID
{
    //instantianting instance variables
    private final Basicinfo department;
    private String EmployeeID;
    private String positionnum;
    private String departmentID;
    private String concatenatedID;

    public GenerateID(Basicinfo department)
    {
        //constructor method with composition
        this.department = department;
    }

    public void setEmployeeID(String EmployeeID)
    {
        //mutator method
        this.EmployeeID = EmployeeID;
    }

    public void setPositionNum(String positionnum)
    {
        //mutator method
        this.positionnum = positionnum;
    }

    public void setConcatenatedID(String concatenatedID)
    {
        this.concatenatedID = concatenatedID;
    }

    // this is going to create a random and return it
    public String getEmployeeID()
    {
        // creating new random
        Random randomEmployeeID = new Random();
        {
            // generate 4 non-unique digits random number
            EmployeeID = Integer.toString(randomEmployeeID.nextInt((9999-1000)+1)+1000);
        }
        return EmployeeID;
    }

    //takes in a string and return the short handed version to be used later
    public String getDepartmentID(String department)
    {
        // i used switch for the department ID
        switch (department)
        {
            case "English":
                departmentID = "ENG";
                break;
            case "Science":
                departmentID = "SCI";
                break;
            case "Engineering":
                departmentID = "ENGR";
                break;
            case "Math":
                departmentID = "MAT";
                break;
            case "Social Science":
                departmentID = "SOC";
                break;
            case "Computer Science":
                departmentID = "CSC";
                break;
            case "Nursing":
                departmentID = "NUR";
                break;
            case "Arts":
                departmentID = "ART";
                break;
            case "Business":
                departmentID = "BUS";
                break;
            default:
                departmentID ="N/A";
                break;
        }
        return (departmentID);
    }

    //creates a random number and returns the departmentID
    // concatenated at the beginning
    public String getPositionNum()
    {
        Random randomPositionNum = new Random();
        {
            //generating 4 non-unique digits random number
            positionnum = Integer.toString(randomPositionNum.nextInt((9999-1000)+1)+1000);
        }
        return (positionnum);
    }

    public String getConcatenatedID()
    {
        concatenatedID = departmentID+positionnum;
        return concatenatedID;
    }

    //displays result, including the BasicInfo object
    @Override
    public String toString()
    {
        return String.format("%s\nEmployeeID: %s\nPosition Number: %s\n",department,EmployeeID,concatenatedID);
    }
}
