/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strago;

/**
 *
 * @author Lenovo
 */
public class SelectionSort {
      public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 2; i++)  {  
            int min = i;  
            for (int j = i + 1; j < arr.length-1; j++){  
                if (arr[j] < arr[min]){  
                    min = j; 
                }  
            }  
            int smallerNumber = arr[min];   
            arr[min] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr = {9,14,3,2,43,11,58};  
        System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr);
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
    }  
}
