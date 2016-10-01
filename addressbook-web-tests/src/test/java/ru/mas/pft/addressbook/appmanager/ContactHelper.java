package ru.mas.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.mas.pft.addressbook.model.ContactData;

/**
 * Created by Alexander on 22.09.2016.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }
  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("home"), contactData.getHome());
    type(By.name("email"), contactData.getEmail());
  }

  public void initContactModification() {
    click(By.cssSelector("img[alt=\'Edit\']"));
  }

  public void updateContactForm() {
    click(By.name("update"));
  }

  public void returnToHomePage() {
    click(By.xpath("//div[@class='msgbox']//a[.='home page']"));
  }

  public void initContactDeletion() {
    click(By.xpath("//input[@value='Delete']"));
    alertAccept();
  }

  public void selectContacts() {
    click(By.name("selected[]"));
  }
}
