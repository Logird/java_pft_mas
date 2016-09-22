package ru.mas.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.mas.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoCreateContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Alex", "Mal", "(495)123-45-67", "example@java.eq"));
    app.getContactHelper().submitContactForm();
  }

}
