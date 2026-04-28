package Jobsheet10.Tugas;

import java.util.Scanner;

public class LayananKRSMain10 {

    static void tampilMenu() {
        System.out.println("\n=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Tambah Mahasiswa Antrian");
        System.out.println("2. Proses 2 Mahasiswa");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Lihat 2 Antrian Terdepan");
        System.out.println("5. Lihat Antrian Terakhir");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Jumlah Sudah KRS");
        System.out.println("8. Jumlah Belum KRS");
        System.out.println("9. Cek Antrian Kosong");
        System.out.println("10. Cek Antrian Penuh");
        System.out.println("11. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    static void tambahData(Scanner sc, AntrianLayanan10 antrian) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Prodi : ");
        String prodi = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        Mahasiswa10 mhs = new Mahasiswa10(nim, nama, prodi, kelas);
        antrian.tambahAntrian(mhs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan10 antrian = new AntrianLayanan10(10, 30);

        int pilih;

        do {
            tampilMenu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    tambahData(sc, antrian);
                    break;
                case 2:
                    antrian.layaniMahasiswa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatTerbelakang();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Sudah KRS: " + antrian.getJumlahSudahKRS());
                    break;
                case 8:
                    System.out.println("Belum KRS: " + antrian.getJumlahBelumKRS());
                    break;
                case 9:
                    System.out.println(antrian.IsEmpty() ? "Kosong" : "Tidak kosong");
                    break;
                case 10:
                    System.out.println(antrian.IsFull() ? "Penuh" : "Belum penuh");
                    break;
                case 11:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 0);

        sc.close();
    }
}