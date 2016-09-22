package ru.mas.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.mas.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.getGroupHelper().submitGroupForm();
        app.getGroupHelper().returnToGroupPage();
    }

}
