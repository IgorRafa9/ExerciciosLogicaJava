
package ativdio2;

import java.util.Scanner;
public class exer4 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        double hp,lp,ha,la,qtd;
        
        System.out.println("Informe a altura da parede: ");
        hp=key.nextDouble();
        System.out.println("Informe o lado da parede: ");
        lp=key.nextFloat();
        System.out.println("Informe a altura do azuleijo: ");
        ha=key.nextDouble();
        System.out.println("Informe o lado do azuleijo: ");
        la=key.nextDouble();
        
        qtd = (hp*lp)/(ha*la);
        
        System.out.printf("Quantidades de azuleijos necessários: %.2f\n",qtd);
    }
    
}
