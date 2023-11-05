package models;


import java.util.Date;

public class Bill {
    Long id;
    String ReferenceId;
    Ticket ticket;
    Date ExitTime;
    Operator operator;
    Gate generatedAtGate;
    Long Amount;
    Payment payment;

    //FeeCalcStrategy

}
