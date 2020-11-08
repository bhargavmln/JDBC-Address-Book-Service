package com.capg.addressbookjdbc;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddressBookTest {

	// UC16
	@Ignore
	@Test
	public void givenAddressBookDB_WhenRetrieved_ShouldMatchContactCount() throws DBCustomException {
		List<Contact> contactList = AddressBookDB.viewAddressBook();
		Assert.assertEquals(5, contactList.size());
	}

	// UC17
	@Ignore
	@Test
	public void givenUpdatedContacts_WhenRetrieved_ShouldBeSyncedWithDB() throws DBCustomException {
		AddressBookDB.updateContactInformation(3, "Bhargav", "Mankala", "1234567987", "mln@gmail.com", "Home",
				"Hyderabad", "Telangana", "50011", "ADD105");
		boolean isSynced = AddressBookDB.isSyncedWithDB("Bhargav");
		Assert.assertTrue(isSynced);
	}

}
