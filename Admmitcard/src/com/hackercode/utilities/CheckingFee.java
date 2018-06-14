package com.hackercode.utilities;
import com.hackercode.userdefinedexceptions.FeeBalanceException;
public class CheckingFee {
    private double fee=95000;
    public double rollno;
    public CheckingFee(int rollno){
        this.rollno=rollno;
        System.out.println("rollno  :"+rollno);
    }
    public void Deposited(double deposit)throws FeeBalanceException{
        double balance=fee-deposit;
        if(balance<=1000)
            System.out.println("Admitcard Generated");
        else
            throw new FeeBalanceException(balance);
    }

}
