
package ativdio2;

import java.util.Scanner;


public class exer2 {

  
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int m=0, f=0;
        float altura;
        float maior=0, menor=Integer.MAX_VALUE;
        float somaH=0;
        float mediaH;
        String resp;
        
        for(int i=0; i<10;i++){
            System.out.println("Sexo [M/F]:");
            resp = key.next();
            System.out.println("Altura: ");
            altura = key.nextFloat();
            if(resp.equalsIgnoreCase("F")){
                f++;
            }else if(resp.equalsIgnoreCase("M")){
                m++;
                somaH+=altura;
            }else{
                System.out.println("Opção inválida");
            }
            
            if(altura > maior){
                maior=altura;
            }
                
            if(altura < menor){
                menor = altura;
            }
        }
        mediaH = somaH / m;
        System.out.printf("O mais alto é %.2f\nO mais baixo é %.2f\n",maior,menor);
        System.out.printf("Média entre os homens: %.2f m\n",mediaH);
        System.out.printf("Número de mulheres: %d\n",f);
        
        
        
        key.close();
    }
    
}
