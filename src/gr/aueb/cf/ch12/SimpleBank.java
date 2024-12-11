package gr.aueb.cf.ch12;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            deposit(100);
        } catch (Exception e){
            System.out.println("An error happened. Try again...");
        }
    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Error. Amount: " + amount + "must not be negative or zero.");
            }
            balance += amount;
            System.out.println("Succesfully deposit: " + amount); //log
        } catch (Exception e){
            System.err.println("Error." +e.getMessage()); //log
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Error. Amount: " + amount + "must not be negative or zero.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Error. Amount: " + amount + " is less than balance.");
            }
            balance -= amount;
            System.out.println("Succesfully withdraw: " + amount); //log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage()); //log
            throw e;
        }

    }
}
