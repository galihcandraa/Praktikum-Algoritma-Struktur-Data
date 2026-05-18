package JobsheetCM2.View;

import java.util.Scanner;

import JobsheetCM2.Model.*;

public class View10 {
    public int cetakMenu(Scanner sc, int pil) {
        System.out.println("=============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("=============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.err.print("Pilih menu: ");
        pil = sc.nextInt();
        sc.nextLine();
        return pil;
    }

    int noAntri = 1;
    public void tambahAntriPembeli(Scanner sc, AntrianPembeli10 antrian) {
        System.out.print("Nama Pembeli  : ");
        String nmPembeli = sc.nextLine();
        System.out.print("No HP         : ");
        String no = sc.nextLine();
        Pembeli10 pembeli = new Pembeli10(noAntri, nmPembeli, no);
        antrian.addLast(pembeli);
        noAntri++;

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + antrian.tail.dataPembeli.noAntri + "\n");
    }

    public void tambahAntriPesanan(Scanner sc, AntrianPesanan10 antrian) {
        System.out.println("=== TAMBAH PESANAN ===");
        System.out.print("Kode Pesanan  : ");
        int kd = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama Pesanan  : ");
        String nm = sc.nextLine();
        System.out.print("Harga         : ");
        int harga = sc.nextInt();
        sc.nextLine();
        Pesanan10 pesanan = new Pesanan10(kd, nm, harga);
        antrian.addLast(pesanan);
    }

    public void cetakAntrian(AntrianPembeli10 antrian) {
        System.out.println("=============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=============================");

        if (!antrian.isEmpty()) {
            System.out.printf("%-15s %-10s %-12s\n", "No Antrian", "Nama", "No HP");
            antrian.print();
            System.out.println();
        } else {
            System.out.println("Antrian masih kosong.\n");
        }
    }

    public void hapusNPesan(Scanner sc, AntrianPembeli10 antrianPembeli, AntrianPesanan10 antrianPesanan) {
        if (antrianPembeli.isEmpty()) {
            System.out.println("Antrian masih kosong.\n");
        }

        String nmPembeli = antrianPembeli.head.dataPembeli.namaPembeli;

        antrianPembeli.removeFirst();

        tambahAntriPesanan(sc, antrianPesanan);
        String nmPesanan = antrianPesanan.tail.dataPesanan.namaPesanan;
        System.out.println(nmPembeli + " telah memesan " + nmPesanan + ".\n");
    }

    public void laporanPesanan(AntrianPesanan10 antrian) {
        System.out.println("==================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==================================");

        if (!antrian.isEmpty() && antrian.head.dataPesanan != null) {
            System.out.printf("%-15s %-15s %-10s\n", "Kode Pesananan", "Nama Pesanan", "Harga");
            antrian.print();
            System.out.println();
        } else {
            System.out.println("Laporan masih kosong.\n");
        }
    }
}
