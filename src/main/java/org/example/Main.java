package org.example;

public class Main {
  public static void main(String[] args) {
    AbstractHandler<PaymentRequest, PaymentResponse> customer =
        new CustomerValidationHandler();

    AbstractHandler<PaymentRequest, PaymentResponse> account =
        new AccountValidationHandler();

    AbstractHandler<PaymentRequest, PaymentResponse> balance =
        new BalanceValidationHandler();

    AbstractHandler<PaymentRequest, PaymentResponse> processor =
        new PaymentProcessorHandler();

    customer.setNext(account)
        .setNext(balance)
        .setNext(processor);

    PaymentRequest request = new PaymentRequest();
    request.setCustomerId("123");
    request.setAccountNumber("ACC001");
    request.setAmount(200);

    PaymentResponse response = new PaymentResponse();

    customer.handle(request, response);
  }
}
