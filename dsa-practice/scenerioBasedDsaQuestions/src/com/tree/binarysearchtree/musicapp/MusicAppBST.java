package com.tree.binarysearchtree.musicapp;

public class MusicAppBST {
    MusicNode root;

    // Scenario 2: Insert New Track
    public void insert(Music music) {
        root = insertID(root, music);
    }

    private MusicNode insertID(MusicNode root, Music music) {
        if (root == null) {
            return new MusicNode(music);
        }

        if (music.musicId < root.music.musicId) {
            root.left = insertID(root.left, music);
        } else if (music.musicId > root.music.musicId) {
            root.right = insertID(root.right, music);
        }

        return root;
    }

    // Scenario 1: Search Track by ID
    public Music search(int musicId) {
        MusicNode node = searchById(root, musicId);
        return node != null ? node.music : null;
    }

    private MusicNode searchById(MusicNode root, int musicId) {
        if (root == null || root.music.musicId == musicId) {
            return root;
        }

        if (musicId < root.music.musicId) {
            return searchById(root.left, musicId);
        }

        return searchById(root.right, musicId);
    }

    // Scenario 3: Display Playlist (In-order Traversal)
    public void display() {
        System.out.println("\n🎶 Playlist (Sorted by Track ID):");
        inorder(root);
    }

    private void inorder(MusicNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                "Music ID: " + root.music.musicId +
                ", Name: " + root.music.musicName
            );
            inorder(root.right);
        }
    }
}
