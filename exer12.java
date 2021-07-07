
package ativdio2;

import java.util.Scanner;

public class exer6 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double kg,h,t,cav;
        
        System.out.println("Informe o kg da massa: ");
        kg = key.nextDouble();
        System.out.println("Informe a altura da massa: ");
        h = key.nextDouble();
        System.out.println("Informe o tempo em segundos(s): ");
        t = key.nextDouble();
        
        cav = (kg*h/t)/745.6999;
        
        System.out.printf("Quantos cavalos serão necessários: %.2f cavalos\n",cav);
    }
    
}
