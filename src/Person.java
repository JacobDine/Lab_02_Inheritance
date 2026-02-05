import java.time.Year;

public class Person
{
    private String IDnum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    // Constructor

    public Person(String IDnum, String firstName, String lastName, String title, int YOB) {
        this.IDnum = IDnum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getIDnum() {
        return IDnum;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDnum='" + IDnum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String toCSV()
    {
        return IDnum + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    public String fullname()
    {
        return firstName + " " + lastName;
    }

    public String formalname()
    {
        return title + " " + firstName + " " + lastName;
    }

    public int getAge()
    {
        return Year.now().getValue() - YOB;
    }

    public int getAge(int year)
    {
        return year - YOB;
    }

    public String toXML()
    {
        return "<person>" +
                "<IDnum>" + IDnum + "</IDnum>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</person>";
    }

    public String toJSON()
    {

        return "{" +
                "\"IDnum\":\"" + IDnum + "\"," +
                "\"firstName\":\"" + firstName + "\"," +
                "\"lastName\":\"" + lastName + "\"," +
                "\"title\":\"" + title + "\"," +
                "\"YOB\":" + YOB +
                "}";

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;           // same object in memory
        if (o == null) return false;          // null check
        if (getClass() != o.getClass()) return false;

        Person other = (Person) o;            // cast Object to Person

        return IDnum.equals(other.IDnum);     // same ID = same person
    }

}

