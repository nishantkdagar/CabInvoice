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
    @Test
    public void given_MultipleRides_ShouldReturn_TotalFare(){
        InvoiceGenerator ig = new InvoiceGenerator();
        Ride[] rides = {new Ride(5.0, 5), new Ride(10.0, 10)};
        double fare = ig.calculatefare(rides);
        Assertions.assertEquals(165, fare);
    }
}
