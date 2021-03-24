package com.company.Esercizi;
import com.company.Classi.BankAccount;

public class Banca {
    public static void main(String[] args)throws Exception{
        BankAccount my = new BankAccount(0);
        my.deposito(1000);
        my.prelievo(250);
        my.prelievo(600);
        my.StampaMovimenti();
    }
}
