package com.tree.avltree.hospitalqueuemanagement;

public class Main {
    public static void main(String[] args) {

        HospitalAVLTree hospital = new HospitalAVLTree();

        hospital.register(new Patient(10, "Amit"));
        hospital.register(new Patient(20, "Neha"));
        hospital.register(new Patient(30, "Rahul"));
        hospital.register(new Patient(40, "Sneha"));
        hospital.register(new Patient(25, "Vikram"));

        hospital.display();

        System.out.println("\n Discharging patient with arrival time 20");
        hospital.discharge(20);

        hospital.display();
    }
}
