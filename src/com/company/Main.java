package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {2, -5, 4, 12, 54, -2, -50, 150};
        int brojacPoz = 0;
        int brojacNeg = 0;
        int[] arrayPoz = new int[array.length];
        int[] arrayNeg = new int[array.length];
	    for (int i=0; i<array.length; i++) {
	        if (array[i] >= 0) {
	            arrayPoz[brojacPoz] = array[i];
	            brojacPoz++;
            }
	        else if (array[i] < 0){
	            arrayNeg[brojacNeg] = array[i];
	            brojacNeg++;
            }
        }
        System.out.print("Pozitivni brojevi niza: ");
	    for (int j=0; j<brojacPoz; j++) {
            System.out.print(arrayPoz[j] +" ");
        }
        System.out.print("\nNegativni brojevi niza: ");
	    for (int k=0; k<brojacNeg; k++) {
            System.out.print(arrayNeg[k] +" ");
        }
    }
}
