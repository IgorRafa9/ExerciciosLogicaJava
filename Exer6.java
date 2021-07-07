
package Exer1;

import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num;        
        int ant;
        int suc;
        
        
        
        do{
            System.out.println("Informe um número");
            num = key.nextInt();
        }while(num<0);
        
        ant=num-1;
        suc=num+1;
        
        System.out.println("Antecessor: "+ant);
        System.out.println("Sucessor: "+suc);
    }
    
}
