package JobsheetCM1;

import java.util.Scanner;

public class SistemManajemen10 {

    // data tiap object/class
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
        System.out.println("5. Cari Berdasarkan Denda");
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
    
    static Mahasiswa10[] urutanNIM(Mahasiswa10[] dataMhs) {
        int jumData = dataMhs.length;
        Mahasiswa10 temp = null;
        
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                int resultCompare = dataMhs[j - 1].nim.compareTo(dataMhs[j].nim);
                if (resultCompare > 0) {
                    temp = dataMhs[j];
                    dataMhs[j] = dataMhs[j - 1];
                    dataMhs[j - 1] = temp;
                }
            }
        }
        return dataMhs;
    }

    static int cariNim(String keyword, Mahasiswa10[] dataMhs, Peminjaman10[] dataPeminjaman, int left, int right) {
        Mahasiswa10[] dataUrut = urutanNIM(dataMhs);

        if (right >= left) {
            int mid = (left + right) / 2;

            // var hasil dari compare data indeks mid dengan keyword
            int resultCompare = dataUrut[mid].nim.compareTo(keyword);

            if (resultCompare == 0) {
                return mid;
            } else if (resultCompare < 0) {
                return cariNim(keyword, dataUrut, dataPeminjaman, mid + 1, right);
            } else {
                return cariNim(keyword, dataUrut, dataPeminjaman, left, mid - 1);
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
                    tampilMhs(dataMhs);
                    break;

                case 2:
                    System.out.println("Daftar Buku:");
                    tampilBuku(dataBuku);
                    break;

                case 3:
                    System.out.println("Data Peminjaman");
                    tampilPeminjaman(dataPeminjaman);
                    break;

                case 4:
                    System.out.println("Setelah diurutkan (denda terbesar)");
                    Peminjaman10[] dataUrut = urutanDenda(dataPeminjaman);
                    for (Peminjaman10 data : dataUrut) {
                        data.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.println("===  PENCARIAN NIM ===");
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.nextLine();
                    int posisi = cariNim(cari, dataMhs, dataPeminjaman, 0, dataMhs.length);
                    if (posisi == -1) {
                        System.out.println("Data tidak ditemukan!");
                    } else {
                        dataMhs[posisi].tampilMahasiswa();
                    }
                    break;

                case 0:
                    System.out.println("Keluar");
                    break;
            }
            if (pil == 0) {
                break;
            }
        } while (pil != 0);

        sc.close();
    }
}
