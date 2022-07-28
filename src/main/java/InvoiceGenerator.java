public class InvoiceGenerator {
    private static final int Cost_Per_Time = 1;
    private static final int Cost_Per_KM = 10;
    public static double calculateFare(double distance, int time) {
        return distance*Cost_Per_KM + time*Cost_Per_Time;
    }

    public double calculatefare(Ride[] rides) {
        double totalFare=0;
        for (Ride allRide:rides){
            totalFare += this.calculateFare(allRide.distance, allRide.time);
        }
        return totalFare;
    }
}
