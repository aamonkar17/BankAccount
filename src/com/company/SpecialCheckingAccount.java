package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double interest;
    private double minBalance;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double a, double minB) {
        super(idNumber, startBal, cc);
        interest = a;
        minBalance = minB;
    }
    public void clearCheck(double amount){
        if(currentBalance() <= minBalance){
            super.clearCheck(amount);
        }
        else{
            decreaseBalance(amount);
        }
    }
    public double monthlyInterest(){
        if(currentBalance() > minBalance){
            double monthlyInt = currentBalance()*interest/12;
            return monthlyInt;
        }
        else{
            super.monthlyInterest();
        }
    }
}
