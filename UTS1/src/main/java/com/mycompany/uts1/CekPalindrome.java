package com.mycompany.uts1;

public class CekPalindrome {
    public static boolean cekPalindrome(String input){
        String lowInput = input.toLowerCase();
        for(int i = 0; i<lowInput.length();i++){
            if(lowInput.charAt(i) != lowInput.charAt(lowInput.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
