package Jobsheet3.src;

import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kolom data dosen: ");
        int kolom = sc.nextInt();
        sc.nextLine();

        Dosen10[] dataDosen = new Dosen10[kolom];
        String kode = null, nama = null, jenisKelamin = null;
        int usia = 0;

        for (int i = 0; i < dataDosen.length; i++) {
            System.out.println("Tambah data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------");

            dataDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }
        
        int index = 1;
        for (Dosen10 dosen : dataDosen) {
            System.out.println("Data Dosen ke-" + index);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.jenisKelamin);
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-------------------");
            index++;
        }

        sc.close();
    }
}
