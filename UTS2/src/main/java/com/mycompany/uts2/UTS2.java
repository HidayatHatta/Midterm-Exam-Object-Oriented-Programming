package com.mycompany.uts2;
import java.util.Scanner;
public class UTS2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi piramid: ");
        int tinggi = input.nextInt();
        for(int i = 0; i<= tinggi; i++){
            for(int a = 0; a <i ;a++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
