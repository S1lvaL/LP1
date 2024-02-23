/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciocio3;

import java.util.Scanner;

public class Exerciocio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1, m1, s1, h2, m2, s2, sh, sm, ss, dh, dm, ds;
        System.out.println("Insira o 1º intervalo de tempo");
        System.out.print("Horas: ");
        h1 = scanner.nextInt();
        System.out.print("Minutos: ");
        m1 = scanner.nextInt();
        System.out.print("Segundos: ");
        s1 = scanner.nextInt();
        System.out.println("Insira o 2º intervalo de tempo: ")  ;
        System.out.print("Horas: ");
        h2 = scanner.nextInt();
        System.out.print("Minutos: ");
        m2 = scanner.nextInt();
        System.out.print("Segundos: ");
        s2 = scanner.nextInt();
        if (h1 < 0 || m1 < 0 || s1 < 0 || h2 < 0 || m2 < 0 || s2 < 0 ) {
            System.out.println("\nErro: Horário negativo detectado.");
        }
        else{
        sh = h1 + h2;
        sm = m1 + m2;
        ss = s1 + s2;
        dh = Math.abs(h1 - h2);
        dm = Math.abs(m1 - m2);
        ds = Math.abs(s1 - s2);
        sm += ss / 60;
        ss %= 60;
        sh += sm / 60;
        sm %= 60;
        
        
        System.out.println("\nSoma dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", sh, sm, ss);
        System.out.println("\nDiferença dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", dh, dm, ds); 
        }
    }
}
