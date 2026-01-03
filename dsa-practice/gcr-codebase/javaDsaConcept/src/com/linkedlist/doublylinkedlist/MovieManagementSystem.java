package com.linkedlist.doublylinkedlist;

/*
 * Node class representing a Movie
 */
class MovieNode {
    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;

    MovieNode next;
    MovieNode prev;

    public MovieNode(String movieTitle, String director, int yearOfRelease, double rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
}

/*
 * Movie Management System using Doubly Linked List
 */
public class MovieManagementSystem {

    private MovieNode head;
    private MovieNode tail;

    /* ---------------- INSERT OPERATIONS ---------------- */

    // Add movie at beginning
    public void insertAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Movie added at beginning.");
    }

    // Add movie at end
    public void insertAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Movie added at end.");
    }

    // Add movie at specific position (1-based index)
    public void insertAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            insertAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Movie added at position " + position);
    }

    /* ---------------- DELETE OPERATION ---------------- */

    // Remove movie by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode temp = head;

        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {

                // If only one node
                if (temp == head && temp == tail) {
                    head = tail = null;
                }
                // If deleting head
                else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                }
                // If deleting tail
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // Middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    /* ---------------- SEARCH OPERATIONS ---------------- */

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displaySingleMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director.");
        }
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displaySingleMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    /* ---------------- UPDATE OPERATION ---------------- */

    // Update rating using movie title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    /* ---------------- DISPLAY OPERATIONS ---------------- */

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println("\n--- Movies (Forward Order) ---");
        MovieNode temp = head;
        while (temp != null) {
            displaySingleMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println("\n--- Movies (Reverse Order) ---");
        MovieNode temp = tail;
        while (temp != null) {
            displaySingleMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper method to print one movie
    private void displaySingleMovie(MovieNode node) {
        System.out.println("Title        : " + node.movieTitle);
        System.out.println("Director     : " + node.director);
        System.out.println("Release Year : " + node.yearOfRelease);
        System.out.println("Rating       : " + node.rating);
        System.out.println("----------------------------------");
    }

    /* ---------------- MAIN METHOD ---------------- */

    public static void main(String[] args) {
        MovieManagementSystem system = new MovieManagementSystem();

        system.insertAtBeginning("Avatar", "James Cameron", 2009, 4.5);
        system.insertAtEnd("Inception", "Christopher Nolan", 2010, 4.8);
        system.insertAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 4.7);

        system.displayForward();
        system.displayReverse();

        system.searchByDirector("Christopher Nolan");
        system.updateRating("Avatar", 4.9);
        system.removeByTitle("Inception");

        system.displayForward();
    }
}
