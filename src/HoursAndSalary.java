public class HoursAndSalary
{
    // static variables to be used for every employees
    protected static double payperhours ;
    protected static int budget ;
    protected static int totalhoursperweek ;

    // This class checks for errors and sets variables to zero
    public HoursAndSalary(int payperhours,int budget,int totalhoursperweek)
    {
        if (payperhours < 9)
        {
            payperhours = 0;
            System.out.println("Minimum wage has to be 9.00!! It has been set"
                    + "to zero");
        }

        if (budget < 0)
        {
            budget = 0;
            System.out.println("The budget has to be positive!! It has been set"
                    + "to zero");
        }

        if (totalhoursperweek < 0)
        {
            payperhours = 0;
            System.out.println("You have to give your employee hours, readjust please!!");
        }

        HoursAndSalary.payperhours = payperhours;
        HoursAndSalary.budget = budget;
        HoursAndSalary.totalhoursperweek = totalhoursperweek;

    }

    // if hours is less than 9 then it is equal to 0
    public void setSalary(int payperhours)
    {
        if (payperhours < 9.0)
        {
            payperhours = 0;
            System.out.println("Minimum wage needs to be 9.00");
        }
        HoursAndSalary.payperhours = payperhours;
    }

    // same thing with budget
    public void setBudget(int budget)
    {
        if (budget < 0)
        {
            budget = 0;
            System.out.println("Budget has to be a positive number");
        }
        HoursAndSalary.budget = budget;
    }

    //setter
    public void setTimeWorked(int totalhoursperweek)
    {
        if (totalhoursperweek < 0)
        {
            payperhours = 0;
            System.out.println("Total time worked has to be positive");
        }
        HoursAndSalary.totalhoursperweek = totalhoursperweek;
    }

    // all these methods are going to return the respective variables to
    // display and store
    public double getSalary()
    {
        return payperhours;
    }

    //getter
    public int getBudget()
    {
        return budget;
    }

    //getter
    public int getTimeWorked()
    {
        return totalhoursperweek;
    }

}
