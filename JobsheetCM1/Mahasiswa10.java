package JobsheetCM1;

public class Mahasiswa10 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa10(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.printf("| %-10s | %-10s | %-25s |\n", nim, nama, prodi);
    }
}

