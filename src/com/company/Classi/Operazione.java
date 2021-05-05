package com.company.Classi;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Operazione {
    String tipoOp;
    Date data;
    DateFormat formatoData;
    double trasferimento;

    public Operazione(String tipoOp, double trasferimento){
        this.tipoOp = tipoOp;
        this.data = new Date();
        this.formatoData = DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALY);
        this.trasferimento = trasferimento;
    }

    @Override
    public String toString() {
        return "operazione{" +
                "Tipo di Operazione effettuata:'" + tipoOp + '\'' +
                ", in data =" + formatoData.format(data) +
                ", di euro =" + trasferimento +
                '}';
    }
}
