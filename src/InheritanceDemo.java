import java.util.ArrayList;


public class InheritanceDemo {
public static void main(String[] args) {


    ArrayList<Worker> recs = new ArrayList<>();



    Worker w1 = new Worker("00001", "Timmy", "Turner", "Mr.", 2002, 18.50);
    Worker w2 = new Worker("00002", "Gumball", "Watterson", "Mr.", 1998, 18.50);
    Worker w3 = new Worker("00003", "Jimmy", "Neutron", "Mr.", 2001, 18.50);
    Worker s1 = new SalaryWorker("00004", "Johnny", "Test", "Mr.", 2002, 52000);
    Worker s2 = new SalaryWorker("00005", "Kim", "Possible", "Ms.", 1998, 52000);
    Worker s3 = new SalaryWorker("00006", "Steven", "Universe", "Mr.", 2000, 52000);

    recs.add(w1);
    recs.add(w2);
    recs.add(w3);
    recs.add(s1);
    recs.add(s2);
    recs.add(s3);

    double[] hours = {40, 50, 40};

    for (int week = 0; week < hours.length; week++) {
        System.out.println("\nWeek " + (week + 1));

        for (Worker w : recs) {
            w.displayWeeklyPay(hours[week]);
        }
    }


}
}
