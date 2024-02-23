/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

import java.util.Scanner;


public class Exercicio4{

    public static void main(String[] args) {
       int num=-1,contdigitos=0; 
        Scanner scanner=new Scanner(System.in);
        while (num<0) {
          System.out.println("Digite um valor inteiro maior ou igual a 0: ");
          num=scanner.nextInt();
          if (num>=0){
              int numdigitos=contdigitos(num);
              System.out.println("O numero de digitos é: "+numdigitos);
          }
        }
    }

    public static int contdigitos(int num) {
        int count=0;
        if (num==0) {
            return 1; 
        }
        while (num!=0) {
            count++;
            num/=10;
        }
        return count;
    }

  
    
}
        
       
    

