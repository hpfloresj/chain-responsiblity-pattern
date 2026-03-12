package org.example;

public class BalanceValidationHandler extends AbstractHandler<PaymentRequest, PaymentResponse>{
  @Override
  public PaymentResponse handle(PaymentRequest request, PaymentResponse response) {
    if (!response.isAccountValid()) {
      throw new RuntimeException("Cuenta inválida");
    }

    System.out.println("Validando saldo");

    if (response.getBalance() >= request.getAmount()) {
      response.setBalanceValid(true);
    } else {
      throw new RuntimeException("Saldo insuficiente");
    }

    return next(request, response);
  }
}
