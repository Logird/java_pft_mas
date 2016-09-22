package ru.mas.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.mas.pft.addressbook.ContactData;
import ru.mas.pft.addressbook.TestBase;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.gotoCreateContactPage();
    app.fillContactForm(new ContactData("Alex", "Mal", "(495)123-45-67", "example@java.eq"));
    app.submitContactForm();
  }

}
