package org.example;

public class AccountValidationHandler extends AbstractHandler<PaymentRequest, PaymentResponse>{

  @Override
  public PaymentResponse handle(PaymentRequest request, PaymentResponse response) {
    if (!response.isCustomerValid()) {
      throw new RuntimeException("Cliente inválido");
    }

    System.out.println("Validando cuenta");

    if ("ACC001".equals(request.getAccountNumber())) {
      response.setAccountValid(true);
      response.setBalance(500);
    }

    return next(request, response);
  }
}
