package org.example;

public class CustomerValidationHandler extends AbstractHandler<PaymentRequest, PaymentResponse>{

  @Override
  public PaymentResponse handle(PaymentRequest request, PaymentResponse response) {
    System.out.println("Validando cliente");

    if ("123".equals(request.getCustomerId())) {
      response.setCustomerValid(true);
    }

    return next(request, response);
  }
}
