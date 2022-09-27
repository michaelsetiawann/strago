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
public class Soal2 {

    public static void main(String[] args) {
        //1 gelas terisi kopi, 0 gelas kosong
        int gelas[] = {1, 0, 0, 1, 1, 0, 1, 0};
        int[] gelasSilang = new int[gelas.length];
        int temp1 = 0;
        int temp2 = 1;
        for (int i = 0; i < gelas.length; i++) {
            if (gelas[i] == 0) {
                gelasSilang[temp2] = gelas[i];
                temp2 += 2;
            } else {
                gelasSilang[temp1] = gelas[i];
                temp1 += 2;
            }
        }
        System.out.print("sebelum diurutkan : ");
        for (int element : gelas) {
            System.out.print(element + ", ");
        }
        System.out.println("");
        System.out.print("sesudah diurutkan : ");
        for (int element : gelasSilang) {
            System.out.print(element + ", ");
        }
    }
}
