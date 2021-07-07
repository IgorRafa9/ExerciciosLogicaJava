
package Exer1;

import java.util.Scanner;


public class Exer1 {

    public static void main(String[] args) {        
       Scanner key = new Scanner (System.in);
       
       int seg=0;
       int min=0;
       int horas=0;
       short dias;
       short meses;
       int anos;      
       
       System.out.println("Escreva sua idade em anos:");
       anos = key.nextInt();
       
       System.out.println("Escreva sua idade em meses:");
       meses = key.nextByte();
       
       System.out.println("Escreva sua idade em dias:");
       dias = key.nextByte();
       
       dias+=(anos * 365) + (meses * 30);
       
       horas+=(dias*24);
       
       min+=(horas*60);
       
       seg+=(min*60);
       
       System.out.println("Idade em dias: "+dias+" dias."+"\n"+
               "Idade em horas: "+horas+" horas."+"\n"+
               "Em minutos: "+min+" min."+"\n"+
               "Em segundos: "+seg+" seg");
    }
    
}
