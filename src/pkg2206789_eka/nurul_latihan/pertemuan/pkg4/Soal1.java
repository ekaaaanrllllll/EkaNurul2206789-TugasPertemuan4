/*
Nama : Eka Nurul Baridah
NIM : 2206789
Kelas : Pendidikan Ilmu Komputer 4 A

Soal 1
Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai dengan
n, dimana n diinput dari alat masukan, n>=1
*/
package pkg2206789_eka.nurul_latihan.pertemuan.pkg4;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai n dari pengguna
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();

        // Memastikan n lebih besar atau sama dengan 1
        if (n < 1) {
            System.out.println("Masukkan nilai n yang valid (n >= 1).");
        } else {
            // Menampilkan bilangan dari 1 sampai n
            System.out.println("Bilangan dari 1 sampai " + n + "");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
