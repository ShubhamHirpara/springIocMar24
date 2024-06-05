package co.pragra.learning.springiocjune012024;

public class Landmark implements IBooking{
    @Override
    public void book() {
        System.out.println("Booking from Landmark");
    }
}
