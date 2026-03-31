package Jobsheet6;

import java.util.Scanner;

public class DosenDemo10 {

    static void tampilMenu() {
        System.out.println("\n=== MENU DATA DOSEN ===");
        System.out.println("1. Tambah data");
        System.out.println("2. Tampil data");
        System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
        System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan (1-5): ");
    }

    static void inputSatuData(Scanner sc, DataDosen10 list) {
        if (list.idx >= list.dataDosen.length) {
            System.out.println("Data dosen sudah penuh!");
            return;
        }

        System.out.println("\n=== Input Data Dosen ===");

        System.out.print("Masukkan Kode           : ");
        String kode = sc.nextLine();

        System.out.print("Masukkan Nama           : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
        boolean jk = sc.nextBoolean();

        System.out.print("Masukkan Usia           : ");
        int usia = sc.nextInt();
        sc.nextLine();

        Dosen10 dsn = new Dosen10(kode, nama, jk, usia);
        list.tambah(dsn);

        System.out.println("Data dosen berhasil ditambahkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen: ");
        int jml = sc.nextInt();
        sc.nextLine();

        DataDosen10 list = new DataDosen10(jml);

        int pil;
        do {
            tampilMenu();
            pil = sc.nextInt();
            sc.nextLine();

            switch (pil) {
                case 1:
                    inputSatuData(sc, list);
                    break;

                case 2:
                    System.out.println("\n=== DATA SELURUH DOSEN ===");
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("\n=== DATA SETELAH SORTING ASC ===");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("\n=== DATA SETELAH SORTING DSC ===");
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pil != 5);

        sc.close();
    }
}