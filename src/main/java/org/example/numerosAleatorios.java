package org.example;

import java.util.ArrayList;

public class numerosAleatorios {
    public static ArrayList<Double > multiplicativeMethod (int a, int quantity, int seed, int limit){
       // System.out.println(a + " " + quantity + " " + seed);
        double x = Double.parseDouble(String.valueOf(seed));
        double m = Math.pow(2,  (Math.log(quantity) / Math.log(2) )+ 2);
        double r;
        a = a*8 + 5;
       // System.out.println("m: " + m+ " a: " + a+ " x: " + x);
        ArrayList<Double> randArray = new ArrayList<Double>();
        for (int i = 0; i < limit; i++) {
            x = (a * x) % m;
           // System.out.println((a * x) % m);
            r = x / (m - 1);
            randArray.add(r);
        }
        return randArray;
    }
}
