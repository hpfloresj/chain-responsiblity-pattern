package org.example;

public abstract class AbstractHandler <REQ, RESP> implements Handler<REQ, RESP> {
  private AbstractHandler<REQ, RESP> next;

  public AbstractHandler<REQ, RESP> setNext(AbstractHandler<REQ, RESP> next) {
    this.next = next;
    return next;
  }

  protected RESP next(REQ request, RESP response) {
    if (next == null) {
      return response;
    }
    return next.handle(request, response);
  }
}
