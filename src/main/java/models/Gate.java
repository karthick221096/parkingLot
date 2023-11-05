package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate {
    Long id;
    String status;
    GateType gateType;
    Operator operator;
}
