/*
Nama : Eka Nurul Baridah
NIM : 2206789
Kelas : Pendidikan Ilmu Komputer 4 A

Buatlah algoritma dalam bahasa Java, menampilkan banyaknya bilangan ganjil dari
batasAwal dan batasAkhir yang diinput dari alat masukan.
*/

package pkg2206789_eka.nurul_latihan.pertemuan.pkg4;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        int banyakGanjil = hitungBanyakGanjil(batasAwal, batasAkhir);

        System.out.println("Banyaknya bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " adalah: " + banyakGanjil);

        scanner.close();
    }

    public static int hitungBanyakGanjil(int batasAwal, int batasAkhir) {
        // Memastikan batasAwal adalah bilangan ganjil
        if (batasAwal % 2 == 0) {
            batasAwal++;
        }

        // Menghitung banyaknya bilangan ganjil dalam rentang
        return (batasAkhir - batasAwal) / 2 + 1;
    }
}
