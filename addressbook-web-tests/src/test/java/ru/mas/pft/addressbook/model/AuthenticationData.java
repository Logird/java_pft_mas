package ru.mas.pft.addressbook.model;

public class AuthenticationData {
  private final String username;
  private final String psw;

  public AuthenticationData(String username, String psw) {
    this.username = username;
    this.psw = psw;
  }

  public String getUsername() {
    return username;
  }

  public String getPsw() {
    return psw;
  }
}
