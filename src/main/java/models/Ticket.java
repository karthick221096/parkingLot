package models;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Ticket {
    Long id;
    Gate gate;
    Date entryTime;
    Operator operator;
    Vehicle vehicle;
    ParkingSlot parkingSlot;
}
