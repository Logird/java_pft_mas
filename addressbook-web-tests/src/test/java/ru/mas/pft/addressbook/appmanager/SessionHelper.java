package ru.mas.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.mas.pft.addressbook.model.AuthenticationData;

/**
 * Created by Alexander on 22.09.2016.
 */
public class SessionHelper {
  private FirefoxDriver wd;

  public SessionHelper(FirefoxDriver wd) {

    this.wd = wd;
  }

  public void login(AuthenticationData authenticationData) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(authenticationData.getUsername());
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(authenticationData.getPsw());
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }
}
