package JobsheetCM1;

public class Buku10 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku10(String kode, String judul, int tahunTerbit) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku() {
        System.out.printf("| %-10s | %-15s | %-10d |\n", kodeBuku, judul, tahunTerbit);
    }
}
