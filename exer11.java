
package ativdio2;


import java.util.Scanner;
public class exer5 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double v,r,a;
        
        System.out.println("Informe o valor do raio: ");
        r = key.nextDouble();
        System.out.println("Informe o valor da altura: ");
        a = key.nextDouble();
        
        v=3.1459*r*r*a;
        
        System.out.printf("Volume da lata: %.2f m³\n",v);
    }
    
}
