package co.pragra.learning.springiocjune012024;

public class Samsung {
    private Cineplex booking;
    private String model;

    public Cineplex getBooking() {
        return booking;
    }

    public void setBooking(Cineplex booking) {
        this.booking = booking;
    }

    public String getModel() {
        return model;
    }

    public Samsung(IBooking booking){
        System.out.println("Object is being created");
        booking = booking;
    }
    // PostConstruct  -> init method
    // PreDestroy -> destroy method
    public void init(){
        System.out.println("connection has been established");
    }
    public void destroy(){
        System.out.println("Connection has been destroyed");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void bookMovie(){
        System.out.println(model);
        //booking.book();

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "booking=" + booking +
                ", model='" + model + '\'' +
                '}';
    }
}
