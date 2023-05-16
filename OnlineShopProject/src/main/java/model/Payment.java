package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
  private PaymentType paymentType;
  private String email;
  private String phoneNumber;
  private String address;

}
