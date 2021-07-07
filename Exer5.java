package Exer1;

import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        
        float sm = 788f;
        float qSal;
        
        System.out.println("Salário do usuário: ");
        float salUsu = key.nextFloat();
        
        qSal=salUsu/sm;
        
        if(salUsu<sm){
            System.out.printf("Não recebe um salário mínimo. %.1f.\n",qSal);
        }else{
            System.out.printf("Quantidade de salários mínimos: %.1f\n",qSal);
        }    
    }
}
    

