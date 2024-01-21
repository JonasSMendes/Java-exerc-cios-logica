package com.JonasSmendes.exercicios;

import java.util.Scanner;

//Criar um programa que calcule a média de salários de uma empresa,
//pedindo ao usuário a grade de funcionários e os salários, e devolvendo
// a média salarial.

public class MediaSalarial {
    public static void MediaSalarial(){
        Scanner scanner = new Scanner(System.in);
        double media;
        double funcionarios = 0;
        int qtfuncionario = 1;
        
        System.out.println("me informe o numero de funcionarios para obter a media:");
        int numeroDeFuncionarios = scanner.nextInt();
        

        for (int i = 0; i < numeroDeFuncionarios; i++){
            System.out.println("Quanto ganha seu funcionario " + qtfuncionario);
            funcionarios = scanner.nextDouble();

            qtfuncionario++;
        }

        media = funcionarios / numeroDeFuncionarios;

        System.out.println("a media salarial dos seus " + numeroDeFuncionarios + " funcionarios é R$" + media);

    }
}
