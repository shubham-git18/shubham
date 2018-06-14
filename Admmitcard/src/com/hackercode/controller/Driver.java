package com.hackercode.controller;
import com.hackercode.utilities.CheckingFee;
import com.hackercode.userdefinedexceptions.FeeBalanceException;
public class Driver {
    public static void main(String args[]){
            CheckingFee f=new CheckingFee(101);
            try{
                System.out.println("Deposited rs 950000");
                f.Deposited(95000);
            }catch(FeeBalanceException e) {
                System.out.println("Admidcard not generated");
            }
    }
}
