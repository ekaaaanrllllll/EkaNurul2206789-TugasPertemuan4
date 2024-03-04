/*
Nama : Eka Nurul Baridah
NIM : 2206789
Kelas : Pendidikan Ilmu Komputer 4 A

Soal 3
Buatlah algoritma dalam bahasa Java, menghitung n!, dimana n>=0, 0!=1, dengan
tampilan sebagai berikut, jika diinput n=5, maka keluarannya harus 5!=5*4*3*2*1=120
 */
package pkg2206789_eka.nurul_latihan.pertemuan.pkg4;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Memastikan n tidak negatif
        if (n < 0) {
            System.out.println("Input tidak valid. n harus lebih besar atau sama dengan 0.");
        } else {
            // Menghitung nilai faktorial
            int hasilFaktorial = hitungFaktorial(n);

            // Menampilkan hasil
            System.out.println(n + "! = " + tampilkanFaktorial(n) + " = " + hasilFaktorial);
        }
        scanner.close();
    }

    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }

    // Fungsi untuk menampilkan faktorial dengan notasi perkalian
    public static String tampilkanFaktorial(int n) {
        if (n == 0 || n == 1) {
            return "1";
        } else {
            return n + "*" + tampilkanFaktorial(n - 1);
        }
    }
}
