package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo10 {

    static void inputData(Scanner sc, MahasiswaBerprestasi10 list, int jumMhs) {

        for (int i = 0; i < jumMhs; i++) {
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
            System.out.println("---------------------------");
            list.tambah(m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(jumMhs);

        inputData(sc, list, jumMhs);

        list.tampil();

        // melakukan pencarian data Sequential
        // System.out.println("----------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("----------------------------");
        // System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        // System.out.print("IPK: ");
        // double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearch(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        
        // melakukan pencarian data Binary
        System.out.println("----------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("----------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------");
        double posisi2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
        sc.close();
    }
}