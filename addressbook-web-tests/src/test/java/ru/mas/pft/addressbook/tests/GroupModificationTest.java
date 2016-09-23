package ru.mas.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.mas.pft.addressbook.model.GroupData;

/**
 * Created by TO on 23.09.2016.
 */
public class GroupModificationTest extends TestBase{

  @Test

  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
    app.getGroupHelper().updateGroupForm();
    app.getGroupHelper().returnToGroupPage();
  }

}
