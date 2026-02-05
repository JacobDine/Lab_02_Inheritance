public class Worker extends Person
{
    double hourlyPayRate;

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                " annualSalary=" + hourlyPayRate +
                "}";
    }

    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(IDnum,firstName,lastName,title,YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPay)
    {
        super(person.getIDnum(),
                person.getFirstName(),
                person.getLastName(),
                person.getTitle(),
                person.getYOB());
        this.hourlyPayRate = hourlyPay;
    }

    public void displayWeeklyPay(double hoursWorked)
    {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);

        double Pay = regularHours * hourlyPayRate;
        double overTime = overtimeHours * hourlyPayRate * 1.5;

        System.out.printf(
                "%s | Regular: %.1f hrs ($%.2f) | OT: %.1f hrs ($%.2f) | Total: $%.2f%n",
                formalname(), regularHours, Pay, overtimeHours, overTime, Pay + overTime
        );
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
            return hoursWorked * hourlyPayRate;
        }
        else
        {
            double Pay = hourlyPayRate * 40;
            double overTime = hourlyPayRate * 1.5 * (hoursWorked - 40);
            return Pay + overTime;
        }
    }

    @Override
    public String toCSV()
    {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toXML()
    {
        return super.toXML().replace("</person>", "<annualSalary>" + hourlyPayRate + "</annualSalary></person>");
    }

    @Override
    public String toJSON()
    {
        return super.toJSON().replace("}", ",\"annualSalary\":" + hourlyPayRate + "}");
    }

}

