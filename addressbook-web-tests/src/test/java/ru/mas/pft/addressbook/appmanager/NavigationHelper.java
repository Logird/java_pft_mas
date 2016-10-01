package ru.mas.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alexander on 22.09.2016.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
    //wd.findElement(By.linkText("groups")).click();
  }

  public void gotoCreateContactPage() {
    click(By.linkText("add new"));
    //wd.findElement(By.linkText("add new")).click();
  }
}
