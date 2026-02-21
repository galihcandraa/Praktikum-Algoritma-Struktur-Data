public class MataKuliah10 {

    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    MataKuliah10() {
    }

    MataKuliah10(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangJam(int jam) {
        if (jam >= jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan!");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah Jam baru: " + jumlahJam);
        }
    }
}
