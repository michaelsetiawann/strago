/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Soal3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = 0;
        System.out.println("Masukan berapa banyak tongkat");
        n = scan.nextInt();
        int counter = 0;
        System.out.println(n);
        while (n != 1) {
            n = Math.ceil(n / 2);
            System.out.println(n);
            counter++;
        }
        System.out.println("banyak nya potongan : " + counter);
    }

}
