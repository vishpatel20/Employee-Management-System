// libraries imported
import java.util.ArrayList;
import java.util.*;

// class start
public class EmployeeClient
{
    //instantiating static variable to count how many employees will be added
    private static int count = 0;

    // main start
    public static void main(String[] args)
    {
        // initialize array lists for all employee info
        ArrayList<String>employeefName = new ArrayList<>();
        ArrayList<String>employeelName = new ArrayList<>();
        ArrayList<String>employeeID = new ArrayList<>();
        ArrayList<String>employeeDept = new ArrayList<>();
        ArrayList<String>employeePhone = new ArrayList<>();
        ArrayList<String>employeeAddress = new ArrayList<>();
        ArrayList<String>employeeEmail = new ArrayList<>();
        ArrayList<String>employeeTitle = new ArrayList<>();
        ArrayList<String>employeeWorkID = new ArrayList<>();
        ArrayList<String>employeePositionNum = new ArrayList<>();

        // scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Employee Management System!" + "\nPress y to start program:  ");
        String start = input.nextLine();

        // loop to dictate options for user
        while (start.equals("y"))
        {
            // start menu options
            System.out.println("There are currently " + employeefName.size() + " employees stored in the system.");     //display current number of employees added
            System.out.println("Press a to start adding employee's info");
            System.out.println("Press f to find employee information");
            System.out.println("Press e to edit employee information");
            System.out.println("Press d to delete employee information");
            System.out.println("Press m to edit financial information about employee");
            System.out.println("Press q to quit");

            String whattodo = input.nextLine();

            // each option has its own if statement
            if (whattodo.equals("a"))
            {
                // general info about employee
                System.out.println("Please enter his/her first name: ");
                String fName = input.nextLine();
                System.out.println("Please enter his/her last name: ");
                String lName = input.nextLine();
                System.out.println("Please enter his/her ID number: ");
                String ID = input.nextLine();
                System.out.println("Please enter his/her department: ");
                String department = input.nextLine();
                System.out.println("Please enter his/her phone number: ");
                String phone = input.nextLine();
                System.out.println("Please enter his/her address: ");
                String address = input.nextLine();
                System.out.println("Please enter his/her email: ");
                String email = input.nextLine();
                System.out.println("Please enter his/her title: ");
                String title = input.nextLine();

                //add info into appropriate arraylists
                employeefName.add(fName);
                employeelName.add(lName);
                employeeID.add(ID);
                employeeDept.add(department);
                employeePhone.add(phone);
                employeeAddress.add(address);
                employeeEmail.add(email);
                employeeTitle.add(title);

                Basicinfo employee = new Basicinfo(employeefName.get(count),
                        employeelName.get(count), employeeID.get(count),
                        employeeAddress.get(count), employeeDept.get(count),
                        employeePhone.get(count), employeeEmail.get(count),
                        employeeTitle.get(count));

                GenerateID employeeIDno = new GenerateID(employee);         //creating new objects to be used by toString
                employeeWorkID.add(employeeIDno.getEmployeeID());               //generate random numbers and save into array
                employeeIDno.getDepartmentID(department);                       //grab departmentID to be concatenated to positionnum
                employeePositionNum.add(employeeIDno.getPositionNum());         //add info into appropriate arraylists
                employeeIDno.getConcatenatedID();                               //combine departmentID and positionnum...this is done individually and not saved into an array
                System.out.printf("%n%s:%n%n%s%n%n","Updated employee info", employeeIDno.toString());          //display using toString
                count++;
            }

            // this is going to find employee info
            if (whattodo.equals("f"))
            {
                System.out.println("Please enter the employee's first name: ");//find employee via searching through arraylists
                String Name = input.nextLine();
                if(employeefName.contains(Name)) //if input matches one of the arraylist entries
                {
                    int index = employeefName.indexOf(Name);        //display found info using the indexOf function to generate the index number
                    Basicinfo employee = new Basicinfo(employeefName.get(index),
                            employeelName.get(index),employeeID.get(index),
                            employeeAddress.get(index),employeeDept.get(index),
                            employeePhone.get(index),employeeEmail.get(index),
                            employeeTitle.get(index));

                    GenerateID employeeIDno = new GenerateID(employee);
                    employeeIDno.getDepartmentID(employeeDept.get(index));
                    employeeIDno.setEmployeeID(employeeWorkID.get(index));
                    employeeIDno.setPositionNum(employeePositionNum.get(index));
                    employeeIDno.getConcatenatedID();
                    System.out.printf("%n%s:%n%n%s%n%n","Employee found: ", employeeIDno.toString());
                }
                else
                    // if invalid info entered then this is going to display
                    System.out.println("Employee cannnot be found in the database!");
            }

            // this is to edit info about employee
            if (whattodo.equals("e"))
            {
                System.out.println("Please enter the employee's first name for identification purpose");
                String Nametobefound = input.nextLine();    //using the same mechanism as above to edit info
                if(employeefName.contains(Nametobefound))
                {
                    int indexno = employeefName.indexOf(Nametobefound);
                    int editoption = 0;

                    while (editoption < 9) //going into each different arraylist and individually edit the corresponding entry
                    {
                        // asking which categories to edit
                        System.out.println("What categories of info would you like to edit about the employee " + employeefName.get(indexno)+ ": ");

                        System.out.println("Enter 1 for first name");
                        System.out.println("Press 2 for last name");
                        System.out.println("Press 3 for ID");
                        System.out.println("Press 4 for department");
                        System.out.println("Press 5 for phone number");
                        System.out.println("Press 6 for address");
                        System.out.println("Press 7 for email");
                        System.out.println("Press 8 for position title");
                        System.out.println("press 9 or anything else to quit");

                        // I used switch case to edit all of the general info
                        editoption = input.nextInt();
                        input.nextLine();
                        switch(editoption)
                        {
                            // first name
                            case 1:
                                System.out.println("Please enter " + employeefName.get(indexno) + "'s new first name: ");
                                String newfirstN = input.nextLine();
                                employeefName.set(indexno, newfirstN);
                                break;
                            // last name
                            case 2:
                                System.out.println("Please enter " + employeefName.get(indexno) +"'s new last name: ");
                                String newlastN = input.nextLine();
                                employeelName.set(indexno, newlastN);
                                break;
                            // ID
                            case 3:
                                System.out.println("Please enter " + employeefName.get(indexno) +"'s new ID: ");
                                String newID = input.nextLine();
                                employeeID.set(indexno, newID);
                                break;
                            //department
                            case 4:
                                System.out.println("Please enter "+employeefName.get(indexno) +"'s new department: ");
                                String newdept = input.nextLine();
                                employeeDept.set(indexno, newdept);
                                break;
                            //phone number
                            case 5:
                                System.out.println("Please enter "+employeefName.get(indexno) +"'s new phone number: ");
                                String newphone = input.nextLine();
                                employeeAddress.set(indexno, newphone);
                                break;
                            // address
                            case 6:
                                System.out.println("Please enter "+employeefName.get(indexno) +"'s new address: ");
                                String newaddress = input.nextLine();
                                employeeAddress.set(indexno, newaddress);
                                break;
                            case 7:
                                System.out.println("Please enter "+employeefName.get(indexno) +"'s new email: ");
                                String newemail = input.nextLine();
                                employeeEmail.set(indexno, newemail);
                                break;
                            //email
                            case 8:
                                System.out.println("Please enter "+employeefName.get(indexno) +"'s new position title: ");
                                String newtitle = input.nextLine();
                                employeeEmail.set(indexno, newtitle);
                                break;
                            // default case which indicates editing is complete
                            default:
                                System.out.println("Editing completed!");
                                break;
                        }

                        Basicinfo employee = new Basicinfo(employeefName.get(indexno),
                                employeelName.get(indexno), employeeID.get(indexno),employeeAddress.get(indexno),
                                employeeDept.get(indexno),employeePhone.get(indexno),
                                employeeEmail.get(indexno),employeeTitle.get(indexno));

                        GenerateID employeeIDno = new GenerateID(employee);
                        employeeIDno.getDepartmentID(employeeDept.get(indexno));
                        employeeIDno.setEmployeeID(employeeWorkID.get(indexno));
                        employeeIDno.setPositionNum(employeePositionNum.get(indexno));
                        employeeIDno.getConcatenatedID();      //display edited info
                        System.out.printf("%n%s:%n%n%s%n%n","Employee info has been edited: ", employeeIDno.toString());
                    }
                }
                else
                { System.out.println("Employee cannot be found");}

            }

            // this to delete
            if(whattodo.equals("d"))
            {
                System.out.println("Please enter the employee's first name for identification purpose");
                String Nametobedeleted = input.nextLine();
                if(employeefName.contains(Nametobedeleted))     //find approriate entry using the same mechanism as above
                {
                    int indexdelete = employeefName.indexOf(Nametobedeleted);
                    Basicinfo employee = new Basicinfo(employeefName.get(indexdelete),
                            employeelName.get(indexdelete),employeeID.get(indexdelete),
                            employeeAddress.get(indexdelete),
                            employeeDept.get(indexdelete),
                            employeePhone.get(indexdelete),
                            employeeEmail.get(indexdelete),
                            employeeTitle.get(indexdelete));


                    System.out.printf("%n%s:%n%n%s%n%n","Employee found: ", employee.toString());   // employee found using tostring
                    System.out.println("Do you want to remove this employee from the database? Enter y!");  // to delete employee
                    String deleteconfirm = input.nextLine();

                    // this if statement is going to delete all emoployee info
                    if(deleteconfirm.equals("y"))
                    {
                        System.out.println("Deleting employee "+employeefName.get(indexdelete)+ "'s info");
                        employeefName.remove(indexdelete);
                        employeelName.remove(indexdelete);
                        employeeID.remove(indexdelete);
                        employeeDept.remove(indexdelete);
                        employeePhone.remove(indexdelete);
                        employeeAddress.remove(indexdelete);
                        employeeEmail.remove(indexdelete);
                        employeeTitle.remove(indexdelete);
                        employeeWorkID.remove(indexdelete);
                        employeePositionNum.remove(indexdelete);        //it is also removing entry from arraylist
                        count--;
                    }
                }
                else
                    System.out.println("Employee cannot be found");
            }

            // financial information
            if ( whattodo.equals("m"))          //ask user to enter appropriate input in order to deduce calculation
            {
                // this will ask for all financial info about the employee
                System.out.println("Please enter the wage per hours: ");
                int salary = input.nextInt();
                input.nextLine();
                System.out.println("Please enter the total budget: ");
                int budget = input.nextInt();
                input.nextLine();
                System.out.println("Please enter the total hours worked per week: ");
                int timeworked = input.nextInt();
                input.nextLine();
                System.out.println("Please enter the total insurance cost: ");
                int insurance = input.nextInt();
                input.nextLine();
                System.out.println("Please enter the total bonus to be given out: ");
                int bonus = input.nextInt();
                input.nextLine();
                System.out.println("Please enter the total overtime hours worked per week: ");
                int overtimeworked = input.nextInt();
                input.nextLine();
                SalaryCalc company = new SalaryCalc(salary,budget,timeworked,insurance,bonus,overtimeworked);
                company.totalYearlySalary();
                company.miscYearlyCostCalc();
                System.out.println(" There are currently " + employeefName.size() +" employees stored in the system.");
                System.out.println(" Is this the correct number of employees? Enter y for yes and n for no: ");

                // this block of code is going to confirm the number of employees
                String confirmnumofemployees = input.nextLine();

                if (confirmnumofemployees.equals("y"))
                {
                    company.yearlyExpenseCalc(employeefName.size());            //takes in number of employee using the size of the array lists
                    company.budgetDeficitCalc();
                }
                else
                {
                    System.out.println("Please enter the number of employees: ");
                    int numofemployees = input.nextInt();
                    input.nextLine();
                    company.yearlyExpenseCalc(numofemployees);//takes in entered number of employee instead of array lists
                    company.budgetDeficitCalc();
                }
            }

            // this is to quit program
            if (whattodo.equals("q"))
            {
                System.out.println("The program will end now!");
                break;
            }
        }
    }
}
