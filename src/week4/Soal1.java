/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Soal1 {

    public static void main(String[] args) {
        //1 gelas terisi kopi, 0 gelas kosong
        int gelas[] = {1, 1, 1, 1, 0, 0, 0, 0};
        int n = gelas.length / 2;
        int[] temp = new int[gelas.length];
        int counter = 0;
        for (int i = 0; i < gelas.length; i += 2) {
            temp[i] = gelas[counter];
            temp[i + 1] = gelas[n + counter];
            counter += 1;
        }
        System.out.print("sebelum diurutkan : ");
        for (int element : gelas) {
            System.out.print(element + ", ");
        }
        System.out.println("");
        System.out.print("sesudah diurutkan : ");
        for (int element : temp) {
            System.out.print(element + ", ");
        }
    }
}
