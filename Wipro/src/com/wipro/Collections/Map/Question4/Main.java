package com.wipro.Collections.Map.Question4;

public class Main {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Sai", 879028747);
		contactsList.addContact("Chandra", 879028748);
		contactsList.addContact("Sukhesh", 879028749);
				
		System.out.println("Chandra: " + contactsList.doesContactNameExist("Chandra"));
		System.out.println("879028749: " + contactsList.doesContactNumberExist(879028749));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}
