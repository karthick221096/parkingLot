package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ParkingSlot {
    Long id;
    String Status;
    VehicleType vehicleType;
    ParkingFloor parkingFloor;
}
