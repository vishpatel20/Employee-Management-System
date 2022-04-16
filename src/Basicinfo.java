// basic info for an employee
public class Basicinfo
{
    // basic info variables type string
    private String firstName;
    private String lastName;
    private String ID;
    private String department;
    private String phone;
    private String address;
    private String email;
    private String title;

    // initialize all variables
    public Basicinfo(String firstName,String lastName, String ID,String address, String department, String phone, String email,String title)
    {
        // this is the constructor method
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.department = department;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.title = title;

    }

    public void setFirstName(String firstName)
    {
        // mutator method
        this.firstName = firstName;
    }

    public String getfirstName()
    {
        // accessor method
        return firstName;
    }

    public void setLastName(String lastName)
    {
        // mutator method
        this.lastName = lastName;
    }

    public String getlastName()
    {
        // accessor method
        return lastName;
    }

    public void setID(String ID)
    {
        // mutator method
        this.ID = ID;
    }

    public String getID()
    {
        // accessor method
        return ID;
    }

    public void setDepartment(String department)
    {
        // mutator method
        this.department = department;
    }

    public String getDepartment()
    {
        // accessor method
        return department;
    }

    public void setAddress(String address)
    {
        // mutator method
        this.address = address;
    }

    public String getAddress()
    {
        // accessor method
        return address;
    }

    public void setEmail(String email)
    {
        // mutator method
        this.email = email;
    }

    public String getEmail()
    {
        // accessor method
        return email;
    }

    public void setTitle(String title)
    {
        // mutator method
        this.title = title;
    }

    public String getTitle()
    {
        // accessor method
        return title;
    }

    public void setPhone(String phone)
    {
        // mutator method
        this.phone = phone;
    }

    public String getPhone()
    {
        // accessor method
        return phone;
    }

    @Override
    public String toString()
    {
        return String.format("First Name: %s Last Name: %s\nID: %s\nDepartment: %s\nPhone Number: %s\nAddress: %s\nEmail Address: %s\nTitle: %s", getfirstName(), getlastName(),getID(),getDepartment(),getPhone(),getAddress(),getEmail(),getTitle());
        // overriden toString method to display all the entered variables
    }
}
