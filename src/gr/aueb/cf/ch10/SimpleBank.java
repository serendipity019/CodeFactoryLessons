package gr.aueb.cf.ch10;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        try {
            deposit(100);
        } catch (Exception e) {
            System.err.println("An error happened. Try Again please!");
        }
    }

    public static void deposit(double amount) throws Exception {
        try{
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount); // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }
}
