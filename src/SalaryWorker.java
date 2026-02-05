public class SalaryWorker extends Worker
{
    private double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                " annualSalary=" + annualSalary +
                "}";
    }

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double annualSalary)
    {
        super(IDnum,firstName,lastName,title,YOB, 0);
        this.annualSalary = annualSalary;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked)
    {
        System.out.printf(
                "%s | Weekly Salary: $" +  calculateWeeklyPay(hoursWorked) + " (Annual: $" + annualSalary + ")%n",
                formalname(),
                calculateWeeklyPay(hoursWorked),
                annualSalary
        );
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
      return annualSalary / 52;
    }

    @Override
    public String toCSV()
    {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML()
    {
        return super.toXML().replace("</person>", "<annualSalary>" + annualSalary + "</annualSalary></person>");
    }

    @Override
    public String toJSON()
    {
        return super.toJSON().replace("}", ",\"annualSalary\":" + annualSalary + "}");
    }

}

