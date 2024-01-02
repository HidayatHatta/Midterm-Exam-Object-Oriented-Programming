package com.mycompany.uts3;
import java.util.Scanner;

public class UTS3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double input = scanner.nextDouble();
        System.out.println("Luas lingkaran: " +Perhitungan.luas(input));
        System.out.println("Keliling lingkaran: " +Perhitungan.keliling(input));
    }
}
