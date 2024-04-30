package org.example.services;

import org.example.entities.Contact;

import java.util.ArrayList;

public interface Phone {
    public void call();
    public void answer();
    public void openKeyboard();
    public void startVoiceMail();
    public ArrayList<Contact> selectFavorites(ArrayList<Contact> contacts);
    public ArrayList<Contact> selectRecent(ArrayList<Contact> contacts);
    public void openContacts(ArrayList<Contact> contacts);
}
