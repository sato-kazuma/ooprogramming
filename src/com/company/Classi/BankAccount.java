package com.company.Classi;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.lang.Exception;

public class BankAccount {

    double saldoAttuale;
    private ArrayList <Operazione> op = new ArrayList<Operazione>();

    public BankAccount(double saldoAttuale) {
        this.saldoAttuale = 0;
    }

    public void prelievo(double somma) throws Exception{
        if(this.saldoAttuale >= somma) {
            this.saldoAttuale -= somma;
        } else{
            throw new Exception();
        }
        op.add(new Operazione("Prelievo", somma));
    }

    public void deposito(double somma){
        this.saldoAttuale += somma;
        op.add(new Operazione("Deposito", somma));
    }

    public void StampaMovimenti(){
        System.out.println(op.toString());
    }
}
