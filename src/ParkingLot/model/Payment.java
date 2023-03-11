package ParkingLot.model;

import ParkingLot.model.enums.PaymentMode;
import ParkingLot.model.enums.TranscationStatus;

public class Payment extends BaseModel{
  private PaymentMode paymentMode;

  private String referenceId;

  private int amount;

  private TranscationStatus transcationStatus;


  public PaymentMode getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(PaymentMode paymentMode) {
    this.paymentMode = paymentMode;
  }

  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public TranscationStatus getTranscationStatus() {
    return transcationStatus;
  }

  public void setTranscationStatus(TranscationStatus transcationStatus) {
    this.transcationStatus = transcationStatus;
  }
}
