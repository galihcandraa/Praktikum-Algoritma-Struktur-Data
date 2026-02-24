package Jobsheet3.src;

import java.util.Scanner;

public class MataKuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kolom matkul: ");
        int kolom = sc.nextInt();
        sc.nextLine();

        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[kolom];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < kolom; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------");

            arrayOfMatakuliah[i] = new Matakuliah10();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < kolom; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("----------------------");
        }
        sc.close();
    }
}
