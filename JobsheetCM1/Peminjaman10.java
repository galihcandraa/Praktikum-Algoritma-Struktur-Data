package JobsheetCM1;

public class Peminjaman10 {
    Mahasiswa10 mhs;
    Buku10 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman10(Mahasiswa10 mhs, Buku10 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > 5) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.printf("| %-10s | %-15s | %-12d | %-10d | %-8d |\n", mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}
