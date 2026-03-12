package org.example;

public interface Handler <REQ, RESP>{
  RESP handle(REQ request, RESP response);
}

