package com.company;

public class SavingsAccount extends Account{
    private double interest;
    public SavingsAccount(int idNumber, double startBal, double a){
        super(idNumber, startBal);
        interest = a;
    }
    public void withdraw(double withdraw){
        if(withdraw < currentBalance()) {
            decreaseBalance(withdraw);
        }
    }
    public double monthlyInterest(){
        double monthlyInt = currentBalance()*interest/12;
        return monthlyInt;
    }
}
