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
        else {
            return super.monthlyInterest();
        }
    }
}

/*
Results:
        Checking account 567.5
        365.5 365.5
        Savings account 300.0
        250.0 250.0
        Special Account 350.0
        247.5 247.5
        Special Account 850.0
        895.0 895.0
        Account 1233
        Balance 365.5
        Interest 1.0
        Account 1234
        Balance 250.0
        Interest 0.8333333333333334
        Account 1235
        Balance 247.5
        Interest 1.0
        Account 1236
        Balance 895.0
        Interest 3.7291666666666665
        Interest: 1.0, .833, 1.0, 3.73

        Process finished with exit code 0
*/