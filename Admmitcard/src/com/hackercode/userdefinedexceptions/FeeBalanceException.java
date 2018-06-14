package com.hackercode.userdefinedexceptions;

public class FeeBalanceException extends Exception{
    private double amount;
    public  FeeBalanceException(double amount){
        this.amount=amount;
    }
    public double getAmount(){
     return amount;
    }
}
