
package ativdio2;

import java.util.Scanner;
public class exer3 {

 
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);
       
       float n[] = new float[4];
       float soma=0;
       float media;
       
       for(int i=0; i<n.length;i++){
           System.out.println("Informe o salário: ");
           n[i] = key.nextFloat();
           soma=soma+n[i];
       }
       media=soma/4;
        System.out.printf("Média salárial: R$%.2f\n",media);
    }
    
}
