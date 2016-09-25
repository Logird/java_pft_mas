package ru.mas.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by TO on 23.09.2016.
 */
public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getContactHelper().selectContacts();
    app.getContactHelper().initContactDeletion();
  }
}
