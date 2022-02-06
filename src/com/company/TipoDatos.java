package com.company;

public class TipoDatos {
    public static void main(String[] args) {
        //1.1 int
        byte varNumByte=3;
        short varNumSh=10;
        int varNumInt=300;
        long varNumLong=1000;
        System.out.println("variable byte = " + varNumByte + " - " +
                "variable short = " + " " + varNumSh + " - " + "variable int = " + " " +
                varNumInt + " - " + "variable tipo long = " + " " + varNumLong);

        System.out.println("----------------------");

        //1.2 decimal
        float varNumFlo=7.5f;
        double varNumDou=20.72d;
        System.out.println("variable float = " + varNumFlo + " - " + "variable double = " + " " +
                varNumDou);

        System.out.println("----------------------");

        //2. boolean
        boolean varBoolTru=true;
        boolean varBoolFal=false;
        System.out.println("variable de tipo boolean verdadero = " + varBoolTru + " - "
                + "variable de tipo boolean falso = " + varBoolFal);

        System.out.println("----------------------");

        //3. text
        char varTexChar='c';
        String varTexString="bootCamp lo mejor";
        System.out.println("imprime un caracter char = " + varTexChar + " - "
                + "Imprime una cadena String = " + varTexString);
    }
}
