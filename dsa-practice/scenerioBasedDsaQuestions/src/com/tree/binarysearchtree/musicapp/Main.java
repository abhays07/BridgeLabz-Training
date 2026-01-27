package com.tree.binarysearchtree.musicapp;

public class Main {
    public static void main(String[] args) {

        MusicAppBST app = new MusicAppBST();

        //Insert Music with id number
        app.insert(new Music(1, "abc"));
        app.insert(new Music(4, "msndn"));
        app.insert(new Music(6, "sd"));
        app.insert(new Music(2, "345tyhgf"));
        app.insert(new Music(8, "sdfg"));

        // Search Track
        System.out.println("Searching music with ID 8");
        Music m = app.search(8);

        if (m != null) {
            System.out.println("Found → ID: " + m.musicId + ", Name: " + m.musicName);
        } else {
            System.out.println("Music not found");
        }

        // Display Playlist
        app.display();
    }
}
