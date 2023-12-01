import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person passenger1 = new Person(1, "IVANOV IVAN IVANOVICH", 12345678,
                12345678, "IVANICH");
        List<BusStop> stopsRoute1 = new ArrayList<>(2);
        BusStop route1Stop1 = new BusStop(1, "KREMLIN", 12.232,24.454);
        BusStop route1Stop2 = new BusStop(2, "HERMITAGE", 45.565, 87.454);
        BusRoute route1 = new BusRoute(1, "MOSCOW - ST.PETERBURG", 2, stopsRoute1);
        Ticket ticket1 = new Ticket(new DecimalFormat("23.12"), new Date(), 1, 2, true,34,12);
        passenger1.BuyTicket();
    }
}
