/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
       int n1, n2,n3,media,rec,medF;
       Scanner tex = new Scanner(System.in);
       System.out.println("Digite a nota da 1º prova: ");
       n1 = tex.nextInt();
       System.out.println("Digite a nota da 2º prova: ");
       n2 = tex.nextInt();
       System.out.println("Digite a nota da 3º prova: ");
       n3 = tex.nextInt();
       media=(n1+n2+n3)/3;
       System.out.println("Sua média: " + media);
       if(media>=7){
           System.out.println("Aprovado! ;) ");
       }
       else{
           System.out.println("Você está de recuperação!");
           System.out.println("Digite a nota da recuperação: ");
           rec=tex.nextInt();
           medF=(media+rec)/2;
           System.out.println("Media da recuperação: "+ medF);
           if(medF>=5){
               System.out.println("Aprovado! ;) ");
           }
           else{
               System.out.println("Reprovado! :( ");
           }
       }
    }
}
