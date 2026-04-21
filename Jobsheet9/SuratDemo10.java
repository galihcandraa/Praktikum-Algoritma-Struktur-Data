package Jobsheet9;

import java.util.Scanner;

public class SuratDemo10 {
    static void tampilMenu() {
        System.out.println("=== SISTEM SURAT ===");
        System.out.println("1. Mengumpulkan Surat");
        System.out.println("2. Memproses Surat");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat");
        System.out.println("0. Keluar");
        System.out.print("Pilih (0 - 4): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimal surat: ");
        int jml = sc.nextInt();
        sc.nextLine();

        StackSurat10 stack = new StackSurat10(jml);
        int pil = 0;

        do {
            tampilMenu();
            pil = sc.nextInt();
            sc.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (I/S): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat10 surat = new Surat10(nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat an.%s berhasil dikumpulkan.\n", surat.namaMahasiswa);
                    break;

                case 2:
                    Surat10 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.printf("Surat %s diproses.\n", diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println(
                                "Surat izin terakhir dikumpulkan oleh " + lihat.namaMahasiswa + " dari kelas " + lihat.kelas);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nm = sc.nextLine();

                    Surat10 cari = stack.cariBerdNama(nm);

                    if (cari != null) {
                        System.out.println("Nama        : " + cari.namaMahasiswa);
                        System.out.println("Kelas       : " + cari.kelas);
                        System.out.println("Jenis Izin  : " + cari.jenisIzin);
                        System.out.println("Durasi      : " + cari.durasi);
                    } else {
                        System.out.println("Surat tidak ada");
                    }
                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pil != 0);
        sc.close();
    }
}
