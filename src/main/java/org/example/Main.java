package org.example;

import static org.example.Conversor.metrosParaMilhas;

public class Main
{
    public static void main( String[] args )
    {
        double resultado = metrosParaMilhas(10000);
        System.out.println(resultado + "É o resultado");
    }
}
