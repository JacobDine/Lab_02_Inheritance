import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WorkerTest {

    @Test
    void testWeeklyPay()
    {
        Worker w = new Worker("W1", "John", "Doe", "Mr.", 1990, 20);
        assertEquals(800.0, w.calculateWeeklyPay(40), 0.001);
    }

    @Test
    void testWeeklyOvertime()
    {
        Worker w = new Worker("W2", "Jane", "Doe", "Mrs.", 1988, 20);
        assertEquals(1100.0, w.calculateWeeklyPay(50), 0.001);
    }
}

