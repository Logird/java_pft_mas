package ru.mas.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.mas.pft.addressbook.model.ContactData;

/**
 * Created by TO on 23.09.2016.
 */
public class ContactModificationTest extends TestBase{
  @Test
  public void testContactModification(){
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Alex", "Mal", "(495)123-45-67", "example@java.eq"));
    app.getContactHelper().updateContactForm();
    app.getContactHelper().returnToHomePage();
  }
}
