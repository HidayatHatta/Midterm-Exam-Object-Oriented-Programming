

package com.mycompany.uts4;
import java.util.Scanner;
public class UTS4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi A: ");
        int sisiA = scanner.nextInt();
        System.out.print("Masukkan panjang sisi B: ");
        int sisiB = scanner.nextInt();
        System.out.print("Masukkan panjang sisi A: ");
        int sisiC = scanner.nextInt();
        
        if(hitungSegitiga(sisiA,sisiB,sisiC)){
            System.out.println("Output: Dapat membentuk segitiga.");
        } else{
            System.out.println("Output: Tidak Dapat membentuk segitiga.");
        }
        
    }
    public static boolean hitungSegitiga(int sisiA, int sisiB, int sisiC){
        return (sisiA + sisiB > sisiC) && (sisiA + sisiC > sisiB) && (sisiB + sisiC > sisiA);
    }
}
