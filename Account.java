/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baingay21;

/**
 *
 * @author nguen
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien nap phai la so duong!");
        }
    }
    public void debit(int amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Thanh toan khong thanh cong!");
        }
    }
    public void transferTo(Account account, int amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            account.balance += amount;
        } else {
            System.out.println("Chuyen tien khong thanh cong!");
        }
    }
        public static void main(String[] args) {
        Account A = new Account("A01", "Nguyen Van A", 50);
        Account B = new Account("B01", "Tran Van B", 10);

        A.transferTo(B, 10);

        System.out.println("A balance: " + A.getBalance()); // 40
        System.out.println("B balance: " + B.getBalance()); // 20
    }
}

