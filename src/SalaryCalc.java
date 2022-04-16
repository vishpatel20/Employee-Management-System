// this is using inheritance here in this class and it is going
// back to the hoursandsalary class
public class SalaryCalc extends HoursAndSalary
{
    //several different simple calculations need to be done to try and find various financial aspects
    private int insurance;
    private int overtimepayperhour;
    private int overtimeworked;     // based on one week
    private double bonus;
    private double miscCost;
    private double yearlyExpense;
    private double totalsalary;

    public SalaryCalc(int payperhours,int budget,int totalhoursperweek,int insurance,double bonus, int overtimeworked )
    {
        // all these statements are going to make sure all values entered are positive numbers
        super(payperhours,budget,totalhoursperweek);
        if (insurance < 0)
        {
            System.out.println("Numbers have to be non-negative. It has to been set to zero");
            insurance = 0;
        }
        if (overtimeworked < 0)
        {
            System.out.println("Numbers have to be non-negative.It has to been set to zero.");
            overtimeworked = 0;
        }
        if (bonus < 0)
        {
            System.out.println("Numbers have to be non-negative.It has to been set to zero.");
            bonus = 0;
        }

        overtimepayperhour = payperhours * (1 / 3) + payperhours;        //overtime work modifier
        this.insurance = insurance;
        this.bonus = bonus;
        this.overtimeworked = overtimeworked;
    }

    // setter
    public void setInsurance(int insurance)
    {
        if (insurance < 0)
        {
            System.out.println("Numbers have to be non-negative. It has to been set to zero");
            insurance = 0;
        }

        this.insurance = insurance;
    }

    // setter
    public void setOvertimePay(int overtimepayperhour)
    {
        if (overtimepayperhour < 9)
        {
            System.out.println("Numbers have to be non-negative.It has to been set to zero.");
            overtimeworked = 0;
        }

        this.overtimepayperhour = overtimepayperhour;
    }

    // setter
    public void setBonus (int bonus)
    {
        if (bonus < 0)
        {
            System.out.println("Numbers have to be non-negative.It has to been set to zero.");
            bonus = 0;
        }
        this.bonus = bonus;
    }

    // setter
    public void setOvertimeWorked(int overtimeworked)
    {
        if (overtimeworked < 0)
        {
            System.out.println("Numbers have to be non-negative.It has to been set to zero.");
            bonus = 0;
        }
        this.overtimeworked = overtimeworked;
    }

    //getter
    public int getInsurance()
    {
        return insurance;
    }

    //getter
    public int getOvertimePay ()
    {
        return overtimepayperhour;
    }

    //getter
    public double getBonus()
    {
        return bonus;
    }

    //getter
    public double getOvertimeWorked()
    {
        return overtimeworked;
    }

    // calculates yearly salary
    public double totalYearlySalary()
    {
        //52 weeks in a year
        totalsalary = (totalhoursperweek*payperhours*52) + (overtimepayperhour*overtimeworked*52);
        System.out.println("The total salary paid out to employee including overtime is $" + totalsalary);
        return totalsalary;
    }

    //calculates misc
    public double miscYearlyCostCalc()
    {
        miscCost = bonus + insurance;
        System.out.println("The miscellaneous cost has an amount of $" + miscCost);
        return miscCost;
    }

    // calculates yearly expense
    public double yearlyExpenseCalc (int noofemployee)
    {
        yearlyExpense = totalsalary * noofemployee + miscCost;
        System.out.println("The yearly expense has an amount of $" + yearlyExpense + "which consisted of misc. cost and total salary paid. ");
        return yearlyExpense;
    }

    // calculates whether budget has a deficit or surplus
    public void budgetDeficitCalc ()
    {
        double Deficit = budget - yearlyExpense;
        if (Deficit > 0.0)
            System.out.println("The current budget has a surplus of $" + Deficit);
        else
            System.out.println("The current budget has a deficit of $" + Deficit);
    }
}
