package ru.mas.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.mas.pft.addressbook.model.AuthenticationData;

/**
 * Created by Alexander on 22.09.2016.
 */
public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(AuthenticationData authenticationData) {
    type(By.name("user"), authenticationData.getUsername());
    type(By.name("pass"), authenticationData.getPsw());
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
