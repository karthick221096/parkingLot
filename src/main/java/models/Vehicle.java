package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    Long id;
    VehicleType vehicleType;
    String vehicleNumber;
    String ownerName;
    String vehicleModel;
}
