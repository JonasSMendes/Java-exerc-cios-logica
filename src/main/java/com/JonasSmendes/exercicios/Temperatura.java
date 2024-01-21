package com.JonasSmendes.exercicios;

public class Temperatura {

    public static void Temperatura(){
        double temperaturCelsius = 29;

        double kelvin = temperaturCelsius + 273.15;
        double fahrenheit = temperaturCelsius * 1.8 + 32;
        double reaumur = temperaturCelsius * 0.8;
        double rankine = temperaturCelsius * 1.8 + 32 + 459.67;

        System.out.println(temperaturCelsius + "C" + " Kelvin :" + kelvin);
        System.out.println(temperaturCelsius + "C" + " fahrenheit :" + fahrenheit );
        System.out.println(temperaturCelsius + "C" + " fahrenheit :" + reaumur);
        System.out.println(temperaturCelsius + "C" + " rankine :" + rankine );
    }

}
