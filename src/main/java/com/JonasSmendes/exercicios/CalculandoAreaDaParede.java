package com.JonasSmendes.exercicios;


//Uma parede em formato retangular, cuja altura é hp (altura da parede)
//e a largura lp (largura da parede) precisa ser coberta por azulejos
//também retangulares. O azulejo retangular tem dimensões ha (altura do
//azulejo) e la (largura do azulejo). Escreva um programa que leia as
//quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as
//medidas dadas são necessários para cobrir a parede dada.

public class CalculandoAreaDaParede {
   public static void CalculandoAreaDaParede(){
       double hp = 2.30;
       double lp = 5.80;
       double ha = 0.03;
       double la = 0.035;


       double areaP = lp * hp;
       double areaA = la * ha;
       double qtazulejo = areaP / areaA;

       System.out.println("a quatida de azulejo para sua " +
               "parede de " + (int)areaP + " metros quadrados,são de : " + (int)qtazulejo + " azulejos" );

   }
}
