import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SalaryWorkerTest {

    @Test
    void testSalary()
    {
        SalaryWorker w = new SalaryWorker("W1", "Jake", "Smith", "Mr.", 1975, 52000);
        assertEquals(1000.0, w.calculateWeeklyPay(40), 0.001);
    }
}


