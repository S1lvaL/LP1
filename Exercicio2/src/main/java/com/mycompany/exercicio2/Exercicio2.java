/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int livro;
        double A, B;
        System.out.println("Digite a quantidade de livros: ");
        livro = teclado.nextInt();
        A = (0.25 * livro) + 7.5;
        B = (0.50 * livro) + 2.5;
        System.out.println("Criterio A: " + A + "\nCriterio B: " + B);
        if(A<B){
            System.out.println("O criterio A é melhor");
        }
        if(B<A){
            System.out.println("O criterio B é melhor");
        }
        else{
            System.out.println("Os dois criterios são");
        }
    }
}
