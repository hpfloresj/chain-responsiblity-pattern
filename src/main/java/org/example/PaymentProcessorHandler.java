package org.example;

public class PaymentProcessorHandler extends AbstractHandler<PaymentRequest, PaymentResponse>{
  @Override
  public PaymentResponse handle(PaymentRequest request, PaymentResponse response) {
    if (!response.isBalanceValid()) {
      throw new RuntimeException("Pago no autorizado");
    }

    System.out.println("Procesando pago de " + request.getAmount());

    return response;
  }
}
