package com.JonasSmendes.exercicios;
import java.util.Scanner;

public class CalculoDeDadosPessoas {
    public static void CalculoDeDadosPessoas(){
        Scanner scanner = new Scanner(System.in);

        int qtMulher = 0;
        int qtHomem = 0;
        int altura = 0;
        int loop = 0;
        float menor= 0;
        float maior = 0;
        float media = 0;

        while ( loop != 3 ){
            System.out.println("escolha de sexo: 1 - mulher 2 - homem");
            int sexo = scanner.nextInt();

            if (sexo != 1 && sexo != 2){
                System.out.println("Dado invalido");
            }else {
                System.out.println("diga a altura dessa pessoa");
                altura = scanner.nextInt();
                if(sexo == 1){
                    qtMulher++;
                }else {
                    qtHomem++;
                    media = media + altura / 2;
                }

                if (maior < altura){
                    maior = altura;
                }else {
                    menor = altura;
                }
                loop++;
            }

        }

        System.out.println("homem contagem: " + qtHomem + ", media de altura: " + media);
        System.out.println("mulher contagem: " + qtMulher );
        System.out.println("media de altura --  maior: " + maior + ", menor: " + menor);
    }
}
