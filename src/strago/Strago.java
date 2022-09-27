/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strago;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Strago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nilaiPertama, nilaiKedua, fibonacci;
        System.out.println("Masukan input fibonacci : ");
        int input = scan.nextInt(); 
        nilaiPertama = 1;
        nilaiKedua = 0;
        fibonacci = 0;
        for (int i = 0; i <= input; i++) {
            System.out.print(nilaiKedua + ", ");
            fibonacci = nilaiPertama + nilaiKedua;
            nilaiPertama = nilaiKedua;
            nilaiKedua = fibonacci;
        }
    }
}
