package JobsheetCM1;

import java.util.Scanner;

public class SistemManajemen10 {

    static void staticData(Mahasiswa10[] dataMhs, Buku10[] dataBuku, Peminjaman10[] dataPeminjaman) {
        dataMhs[0] = new Mahasiswa10("22001", "Andi", "Teknik Informatika");
        dataMhs[1] = new Mahasiswa10("22002", "Budi", "Teknik Informatika");
        dataMhs[2] = new Mahasiswa10("22003", "Citra", "Sistem Informasi Bisnis");

        dataBuku[0] = new Buku10("B001", "Algoritma", 2020);
        dataBuku[1] = new Buku10("B002", "Basis Data", 2019);
        dataBuku[2] = new Buku10("B003", "Pemrograman", 2021);
        dataBuku[3] = new Buku10("B004", "Fisika", 2024);

        dataPeminjaman[0] = new Peminjaman10(dataMhs[0], dataBuku[0], 7);
        dataPeminjaman[1] = new Peminjaman10(dataMhs[1], dataBuku[1], 3);
        dataPeminjaman[2] = new Peminjaman10(dataMhs[2], dataBuku[2], 10);
        dataPeminjaman[3] = new Peminjaman10(dataMhs[2], dataBuku[3], 6);
        dataPeminjaman[4] = new Peminjaman10(dataMhs[0], dataBuku[1], 4);
    }

    static void tampilMenu() {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }

    static void tampilMhs(Mahasiswa10[] dataMhs) {
        for (Mahasiswa10 mhs : dataMhs) {
            mhs.tampilMahasiswa();
        }
    }

    static void tampilBuku(Buku10[] dataBuku) {
        for (Buku10 buku : dataBuku) {
            buku.tampilBuku();
        }
    }

    static void tampilPeminjaman(Peminjaman10[] dataPeminjaman) {
        for (Peminjaman10 p : dataPeminjaman) {
            p.tampilPeminjaman();
        }
    }

    static Peminjaman10[] urutanDenda(Peminjaman10[] dataPeminjaman) {
        int jumData = dataPeminjaman.length;
        Peminjaman10 temp;

        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (dataPeminjaman[j - 1].denda > dataPeminjaman[j].denda) {
                    temp = dataPeminjaman[j];
                    dataPeminjaman[j] = dataPeminjaman[j - 1];
                    dataPeminjaman[j - 1] = temp;
                }
            }
        }
        return dataPeminjaman;
    }

    static Peminjaman10[] urutanNIM(Peminjaman10[] dataMhs) {
        int jumData = dataMhs.length;
        Peminjaman10 temp = null;

        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                int resultCompare = dataMhs[j - 1].mhs.nim.compareTo(dataMhs[j].mhs.nim);
                if (resultCompare > 0) {
                    temp = dataMhs[j];
                    dataMhs[j] = dataMhs[j - 1];
                    dataMhs[j - 1] = temp;
                }
            }
        }
        return dataMhs;
    }

    static int cariNim(Peminjaman10[] dataPeminjaman, String keyword, int left, int right) {
        Peminjaman10[] dataUrut = urutanNIM(dataPeminjaman);

        if (right >= left) {
            int mid = (left + right) / 2;

            int resultCompare = dataUrut[mid].mhs.nim.compareTo(keyword);

            if (resultCompare == 0) {
                return mid;
            } else if (resultCompare < 0) {
                return cariNim(dataUrut, keyword, mid + 1, right);
            } else {
                return cariNim(dataUrut, keyword, left, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa10[] dataMhs = new Mahasiswa10[3];
        Buku10[] dataBuku = new Buku10[4];
        Peminjaman10[] dataPeminjaman = new Peminjaman10[5];

        staticData(dataMhs, dataBuku, dataPeminjaman);

        int pil;
        do {
            tampilMenu();
            pil = sc.nextInt();
            sc.nextLine();

            for (Peminjaman10 data : dataPeminjaman) {
                data.hitungDenda();
            }

            switch (pil) {
                case 1:
                    System.out.println("Daftar Mahasiswa");
                    System.out.printf("| %-10s | %-10s | %-25s |\n", "NIM", "Nama", "Prodi");
                    tampilMhs(dataMhs);
                    break;

                case 2:
                    System.out.println("Daftar Buku:");
                    System.out.printf("| %-10s | %-15s | %-12s |\n", "Kode Buku", "Judul", "Tahun Terbit");
                    tampilBuku(dataBuku);
                    break;

                case 3:
                    System.out.println("Data Peminjaman");
                    System.out.printf("| %-10s | %-15s | %-12s | %-10s | %-8s |\n", "Nama", "Judul Buku",
                            "Lama Pinjam", "Terlambat", "Denda");
                    tampilPeminjaman(dataPeminjaman);
                    break;

                case 4:
                    System.out.println("Setelah diurutkan (denda terkecil)");
                    Peminjaman10[] dataUrut = urutanDenda(dataPeminjaman);

                    System.out.printf("| %-10s | %-15s | %-12s | %-10s | %-8s |\n", "Nama", "Judul Buku",
                            "Lama Pinjam", "Terlambat", "Denda");
                    for (Peminjaman10 data : dataUrut) {
                        data.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.println("===  PENCARIAN NIM ===");
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.nextLine();
                    int posisi = cariNim(dataPeminjaman, cari, 0, dataMhs.length - 1);
                    if (posisi == -1) {
                        System.out.println("Data tidak ditemukan!");
                    } else {
                        System.out.printf("| %-10s | %-15s | %-12s | %-10s | %-8s |\n", "Nama", "Judul Buku",
                                "Lama Pinjam", "Terlambat", "Denda");
                        dataPeminjaman[posisi].tampilPeminjaman();
                    }
                    break;

                case 0:
                    System.out.println("Keluar");
                    break;
            }
        } while (pil != 0);

        sc.close();
    }
}


