package com.tree.avltree.hospitalqueuemanagement;

public class HospitalAVLTree {

    AVLNode root;

    // 🔹 Scenario 1: Patient Registration
    public void register(Patient patient) {
        root = insert(root, patient);
    }

    private AVLNode insert(AVLNode node, Patient patient) {
        if (node == null)
            return new AVLNode(patient);

        if (patient.arrivalTime < node.patient.arrivalTime)
            node.left = insert(node.left, patient);
        else if (patient.arrivalTime > node.patient.arrivalTime)
            node.right = insert(node.right, patient);
        else
            return node; // duplicate arrival time not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));

        return balance(node);
    }

    // 🔹 Scenario 2: Discharge Patient
    public void discharge(int arrivalTime) {
        root = delete(root, arrivalTime);
    }

    private AVLNode delete(AVLNode node, int arrivalTime) {
        if (node == null)
            return node;

        if (arrivalTime < node.patient.arrivalTime)
            node.left = delete(node.left, arrivalTime);
        else if (arrivalTime > node.patient.arrivalTime)
            node.right = delete(node.right, arrivalTime);
        else {
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                AVLNode min = getMin(node.right);
                node.patient = min.patient;
                node.right = delete(node.right, min.patient.arrivalTime);
            }
        }

        if (node == null)
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        return balance(node);
    }

    // 🔹 Scenario 3: Display Patients by Arrival Time
    public void display() {
        System.out.println("\n📋 Patients by Arrival Time:");
        inorder(root);
    }

    private void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(
                "Arrival Time: " + node.patient.arrivalTime +
                ", Name: " + node.patient.name
            );
            inorder(node.right);
        }
    }

    // 🔧 AVL Helpers
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    private int balanceFactor(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode balance(AVLNode node) {
        int balance = balanceFactor(node);

        // Left Left
        if (balance > 1 && balanceFactor(node.left) >= 0)
            return rotateRight(node);

        // Left Right
        if (balance > 1 && balanceFactor(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Right Right
        if (balance < -1 && balanceFactor(node.right) <= 0)
            return rotateLeft(node);

        // Right Left
        if (balance < -1 && balanceFactor(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private AVLNode getMin(AVLNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
