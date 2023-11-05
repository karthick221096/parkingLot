package models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ParkingFloor {
    Long id;
    String status;
    List<ParkingSlot> parkingSlots;
    String floorNumber;
}
