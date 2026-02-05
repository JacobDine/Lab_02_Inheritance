public class PersonDriver {
    public static void main(String[] args)
    {
        Person p1 = new Person("12345", "John", "Doe", "Mr.", 1970);

        System.out.println(p1);
        System.out.println();
        System.out.println("Person Details:");
        System.out.println("ID Number: " + p1.getIDnum());
        System.out.println("First Name: " + p1.getFirstName());
        System.out.println("Last Name: " + p1.getLastName());
        System.out.println("Title: " + p1.getTitle());
        System.out.println("Year of Birth: " + p1.getYOB());

        System.out.println("\nCSV Data String");
        System.out.println(p1.toCSV());

        System.out.println("\nJSON Data String");
        System.out.println(p1.toJSON());

        System.out.println("\nXML Data String");
        System.out.println(p1.toXML());
    }
}
