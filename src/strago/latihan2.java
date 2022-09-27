/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strago;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class latihan2 {

    public static void sequentialSearch(int[] arrAngka, int cari) {
        int index = -1;
        for (int i = 0; i < arrAngka.length; i++) {
            if (arrAngka[i] == cari) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("===== Sequential Search =======");
            System.out.println("Bilangan tidak ditemukan dalam index");
            System.out.println("");
        } else {
            System.out.println("===== Sequential Search =======");
            System.out.println("Bilangan ditemukan di index " + index);
            System.out.println("");
        }
    }

    public static void binarySearch(int[] arrAngka, int awal, int akhir, int cari) {
        int cekLooping = 1;
        int tengah = (awal + akhir) / 2;
        while (awal <= akhir) {
            if (arrAngka[tengah] < cari) {
                awal = tengah + 1;
            } else if (arrAngka[tengah] == cari) {
                System.out.println("===== Binary Search =======");
                System.out.println("Bilangan ditemukan di index " + tengah);
                System.out.println("");
                break;
            } else {
                akhir = tengah - 1;
            }
            tengah = (awal + akhir) / 2;
            System.out.println("cek Looping binary search nya ada berapa kali : " + cekLooping);
            cekLooping++;
        }
        if (awal > akhir) {
            System.out.println("");
            System.out.println("===== Binary Search =======");
            System.out.println("Bilangan tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        int maks = 500000;
        int[] angka = new int[maks];
        for (int i = 0; i < maks; i++) {
            angka[i] = i + 1;
        }
        int cari = 500001;
        sequentialSearch(angka, cari);
        binarySearch(angka, 0, angka.length - 1, cari);

        // dari hasil perbandingan yang lebih efisien dari keduanya ialah binary search
        // alasan nya karena binary cek nya cuman separuh data yang ada
        // terbukti binary search hanya 19 kali berbeda jauh dengan sequantial search
    }
}
