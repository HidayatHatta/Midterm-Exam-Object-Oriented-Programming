package com.mycompany.uts5;
import java.util.Scanner;
public class UTS5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja: ");
        int jam = scanner.nextInt();
        System.out.print("Masukkan tarif per jam: ");
        int tarif = scanner.nextInt();
        double gajiKaryawan;
        if (jam > 40){
            int jamLembur = jam - 40 ;
            gajiKaryawan = (jam*tarif) + (jamLembur*5);
        } else {
            gajiKaryawan = jam*tarif;
        }
        System.out.println("Gaji karyawan: " + gajiKaryawan);
    }
}