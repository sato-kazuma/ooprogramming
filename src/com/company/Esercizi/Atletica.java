package com.company.Esercizi;


import com.company.Classi.Atleta;

public class Atletica {
    public static void main(String args[]){
        Atleta marco=new Atleta();
        marco.setNome("marco");
        marco.setCognome("pala");
        marco.setAltezza(1.80);
        marco.setPeso(87);
        marco.setDataDiNascita("30/01/2000");
        marco.setSpecialità("palla a mano");
        System.out.println(marco);
    }
}
