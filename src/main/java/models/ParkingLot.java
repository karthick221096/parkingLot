package models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ParkingLot {
    long id;
    String address;
    String status;
    List<ParkingFloor> parkingFloors;
    List<Gate> gates;
}
