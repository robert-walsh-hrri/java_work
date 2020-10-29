package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private static ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public static ArrayList<Contact> getAllContacts() {
        return contacts;
    }

    public static void addContact(Contact contact) {
        int index = lookupContact(contact.getContactName());

        if (index == -1) {
            contacts.add(contact);
        }
    }

    public static void renameContact(String lookupName, String changeName) {
        int index = lookupContact(lookupName);

        if (index >= 0) {
            contacts.get(index).setContactName(changeName);
        }

    }

    public static void removeContact(String lookupName) {
        int index = lookupContact(lookupName);

        if (index >= 0) {
            contacts.remove(index);
        }

    }

    public static int lookupContact(String lookupName) {
        for (int i = 0; i < contacts.toArray().length; i++) {
            if (contacts.get(i).getContactName() == lookupName) {
                return i;
            }
        }
        return -1;
    }

    public static Contact retrieveContact(String contactName) {
        int index = lookupContact(contactName);

        if (index >= 0) {
            return contacts.get(index);
        }

        return null;
    }

    public static void printContacts() {
        for (int i = 0; i < contacts.toArray().length; i++) {
            System.out.println(contacts.get(i).getContactName() + " " + contacts.get(i).getPhoneNumber());
        }
    }
}






















