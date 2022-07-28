import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void given_DistanceAndTime_ShouldReturn_TotalFare(){
        InvoiceGenerator ig = new InvoiceGenerator();
        /*
        Provide Distance in KM
        and
        Time in Minutes
         */
        double distance = 5.0;
        int time = 5;
        double fare = InvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(55,fare);
    }
}
