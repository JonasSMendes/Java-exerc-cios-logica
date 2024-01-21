package com.JonasSmendes.exercicios;

import java.util.Scanner;

public class JogoNumeroAleatorio {
    public static void JogoNumeroAleatorio(){
        Scanner scanner = new Scanner(System.in);
        int valorInicial = (int)(Math.random() * 100 + 1);

        System.out.println("chute o numero de 1 a 100");
        int chute = scanner.nextInt();

        while (chute != valorInicial) {

            if (chute > 100 || chute < 1) {
                System.out.println("Apenas valores de 1 a 100");
                chute = scanner.nextInt();
            }else{
                if (chute == valorInicial) {
                    break;
                } else {
                    if (chute < valorInicial) {
                        System.out.println("o numero é maior");
                    } else {
                        System.out.println("0 numero é menor");
                    }
                    chute = scanner.nextInt();
                }
            }
        }
        System.out.println("parabens você acertou");
    }


}
