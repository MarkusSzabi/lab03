package com.company;

public class Main{
    public static void main (String[] args){

        int numerePrimGasite = 0;
        int numarCurent = 10;

        System.out.println("Primele zece numere prime sunt: ");

        while (numerePrimGasite < 10) {

            boolean estePrim = true;

            for (int i = 2; i<= Math.sqrt(numarCurent); i++){

                    if(numarCurent % i == 0){
                    estePrim = false;
                    break;

                    }
            }

            if (estePrim) {

                System.out.print(numarCurent +" ");
                numerePrimGasite++;

            }
            numarCurent ++;

        }

    }
}
