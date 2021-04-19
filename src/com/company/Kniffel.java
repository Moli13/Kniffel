package com.company;

import java.util.Random;

public class Kniffel {
    java.util.Random wuerfelWurf;

    public Kniffel(){
        wuerfelWurf = new Random();
    }

    public int[]wuerfelZahlen(int length){
       int []zahlen= new int[length];
       for(int  i= 0; i < length; i++) {
           zahlen[i] = wuerfelWurf.nextInt(6) + 1;
       }
       return zahlen;
    }
}
