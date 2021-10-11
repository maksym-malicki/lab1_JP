package com.company;

public class Main {

    public static void main(String[] args) {
        String lancuch="Witaj", imie="Maks";
	    System.out.println(String.format("%s posiadaczu imienia: %s",lancuch, imie));
        for(int i=1; i<11; i++){
            for(int j=1; j<11; j++){
                System.out.print(String.format("%4d", i*j));
            }
            System.out.println();
        }
        System.exit(0);
    }
}
