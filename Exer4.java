
package Exer1;

import java.util.Scanner;


public class Exer4 {

 
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        
        System.out.println("Código da peça 1: ");
        String cod1 = key.next();
        
        System.out.println("Código da peça 2: ");
        String cod2 = key.next();
        
        System.out.println("Preço da peça 1: ");
        float preço1=key.nextFloat();
        
        System.out.println("Preço da peça 2: ");
        float preço2=key.nextFloat();
        
        System.out.println("Quantidade da peça 1: ");
        float quant1=key.nextFloat();
        
        System.out.println("Quantidade da peça 2: ");
        float quant2=key.nextFloat();
        
        System.out.println("Valor do IPI: ");
        float ipi=key.nextInt();
        
        float valorGeral;
        valorGeral = valorTotal(preço1,quant1,preço2,quant2)*(ipi/100+1);
        
        System.out.println("Valor total: R$"+valorGeral);
    }
    private static float valorTotal(float p1, float q1, float p2, float q2){
        return (p1*q1+p2*q2);
    }
}
