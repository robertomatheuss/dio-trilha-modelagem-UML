package org.example;

import org.example.entities.Album;
import org.example.entities.Contact;
import org.example.services.*;

import java.util.ArrayList;

public class Iphone implements IPod, Phone, Browser, Photos, TextingSMS,Mail {
    private Long id;
    private ArrayList<Contact> contacts;
    private ArrayList<Album> albums;

    @Override
    public void displayPage() {

    }

    @Override
    public void addNewTab() {

    }

    @Override
    public void updatePage() {

    }

    @Override
    public void openGoogleMaps() {

    }

    @Override
    public void playSong() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void selectSong() {

    }

    @Override
    public void switchToAlbumSection() {

    }

    @Override
    public void switchToMusicSection() {

    }

    @Override
    public void call() {

    }

    @Override
    public void answer() {

    }

    @Override
    public void openKeyboard() {

    }

    @Override
    public void startVoiceMail() {

    }

    @Override
    public ArrayList<Contact> selectFavorites(ArrayList<Contact> contacts) {
        return null;
    }

    @Override
    public ArrayList<Contact> selectRecent(ArrayList<Contact> contacts) {
        return null;
    }

    @Override
    public void openContacts(ArrayList<Contact> contacts) {

    }

    @Override
    public void openLandscapeMode() {

    }

    @Override
    public void selectAlbum() {

    }

    @Override
    public void openEmail() {

    }

    @Override
    public void sendEmail() {

    }

    @Override
    public void selectContact() {

    }

    @Override
    public void sendMessage() {

    }
}
