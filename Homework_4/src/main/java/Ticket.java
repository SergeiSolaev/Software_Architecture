import java.text.DecimalFormat;
import java.util.Date;

public class Ticket {
    private DecimalFormat price;
    private Date date;
    private int startZone;
    private int stopZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    public Ticket(DecimalFormat price, Date date, int startZone, int stopZone,
                  boolean isLuggage, int place, int roadNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.stopZone = stopZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.roadNumber = roadNumber;
    }
}
