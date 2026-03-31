package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo10 {

    static void inputData(Scanner sc, MahasiswaBerprestasi10 list, int jml) {

        for (int i = 0; i < jml; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1) + ": ");

            Mahasiswa10 m = new Mahasiswa10();

            System.out.print("Masukkan NIM   : ");
            m.nim = sc.nextLine();
            System.out.print("Masukkan Nama  : ");
            m.nama = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            m.kelas = sc.nextLine();
            System.out.print("Masukkan IPK   : ");
            m.ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mahasiswa berprestasi: ");
        int jml = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(jml);

        inputData(sc, list, jml);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting (DESCENDING IPK):");
        list.bubbleSort();
        list.tampil();

        sc.close();
    }
}