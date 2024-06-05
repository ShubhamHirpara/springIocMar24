package co.pragra.learning.springiocjune012024;

public class Cineplex implements IBooking{
    @Override
    public void book() {
        System.out.println("Booking from Cineplex");
    }
}
