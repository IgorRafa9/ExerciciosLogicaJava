
package Exer1;

import java.util.Scanner;


public class Exer3 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Informe um saldo: ");
        float saldo = key.nextFloat();
        
        float reajuste=0.01f;
        
        float novoSaldo;
        
        novoSaldo=saldo+(saldo*reajuste);
        
        System.out.printf("Saldo reajustado: %.2f\n",novoSaldo);
    }
    
}
