package com.ecpe205;
import java.lang.Math;
import java.util.Locale;

public class Calculator {
    public double APowerB (double a, double b) {
        return Math.pow(a,b);
    }

    public int factorial (int x) {
        int factorial = 1;
        for(int i = 1; i <= x; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public String palindrome (String p) {
        String pal = "";
        int l = p.length();
        for (int i = (l - 1); i >= 0; --i){
            pal = pal + p.charAt(i);
        }
        return pal.toLowerCase();
    }


}
