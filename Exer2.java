
package Exer1;

import java.util.Scanner;


public class Exer2 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        int num1=Integer.hashCode(7);
        int num2=Integer.hashCode(8);
        int num3=Integer.hashCode(9);
        
        float media1;
        float media2;
        float mediaGeral;
        float soma;       
        
        int num4=Integer.hashCode(4);
        int num5=Integer.hashCode(5);
        int num6=Integer.hashCode(6);
        
        media1=(num1+num2+num3)/3;
        media2=(num4+num5+num6)/3;
        soma=media1+media2;
        mediaGeral=(media1+media2)/2;
        
        System.out.println("Média de 7,8,9: "+media1);
        System.out.println("Média de 4,5,6: "+media2);
        System.out.println("Soma das 2 médias: "+soma);
        System.out.println("Média geral: "+mediaGeral);
    }
    
}
