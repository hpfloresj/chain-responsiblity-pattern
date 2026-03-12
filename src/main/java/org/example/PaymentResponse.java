package org.example;

public class PaymentResponse {
  private boolean customerValid;
  private boolean accountValid;
  private boolean balanceValid;
  private double balance;

  public boolean isCustomerValid() {
    return customerValid;
  }

  public void setCustomerValid(boolean customerValid) {
    this.customerValid = customerValid;
  }

  public boolean isAccountValid() {
    return accountValid;
  }

  public void setAccountValid(boolean accountValid) {
    this.accountValid = accountValid;
  }

  public boolean isBalanceValid() {
    return balanceValid;
  }

  public void setBalanceValid(boolean balanceValid) {
    this.balanceValid = balanceValid;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
