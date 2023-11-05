package models;

import java.util.Date;

public class Payment {
    Long id;
    Bill bill;
    PaymentMode paymentMode;
    Date paymentTime;
    Long amount;
    String referenceNumber;
}
