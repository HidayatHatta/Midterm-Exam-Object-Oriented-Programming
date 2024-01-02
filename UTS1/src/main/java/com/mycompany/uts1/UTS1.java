package com.mycompany.uts1;
import java.util.Scanner;
public class UTS1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata atau frasa: ");
        String kata = scanner.nextLine();
        
        if(CekPalindrome.cekPalindrome(kata)){
            System.out.println("Output: " + kata + " adalah palindrome");
        } else {
            System.out.println("Output: " + kata + " kata bukan palindrome");
        }
    }
}
