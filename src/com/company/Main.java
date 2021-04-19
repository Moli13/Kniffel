package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Kniffel game= new Kniffel();
        int[] res= game.wuerfelZahlen(1);
        System.out.println(Arrays.toString(res));
    }

}