
package ativdio2;

import java.util.Scanner;


public class exer1 {

   
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double k, re, ra, f,c; 
        int temp;
        String resp = "N";
      do{  
        System.out.println("Informe a temperatura em Celsius: ");
        c = key.nextDouble();
        System.out.println("Escolha a temperatura que deseja converter: ");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelwin");
        System.out.println("3 - Réaumur");
        System.out.println("4 - Rankine");
        temp=key.nextInt();
        switch(temp){
            case 1:
              f=c*(1.8+32);
              System.out.printf("%.2fºC ----> %.2fºF\n",c,f);
              break;
            case 2:
              k = c + 273.15;
              System.out.printf("%.2fºC ----> %.2fºK\n",c,k);
              break;
            case 3:
               re = c * 0.8;
               System.out.printf("%.2fºC ----> %.2fºRe\n",c,re);
               break;
            case 4:
               ra = c * 1.8 + 32 + 452.67;
               System.out.printf("%.2fºC ----> %.2fºRa\n",c,ra);
               break;
            default:
                System.out.println("Opção inválida.");
        }
          System.out.println("Deseja fazer outro?");
          resp=key.next();
      }while(resp.equalsIgnoreCase("S"));
        
    }
    
}
