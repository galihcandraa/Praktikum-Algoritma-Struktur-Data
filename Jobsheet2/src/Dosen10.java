public class Dosen10 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen10() {
    }

    Dosen10(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    boolean setStatusAktif(boolean status) {
        return statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Lama bekerja: " + masaKerja + " tahun");
        return masaKerja;
    }

    String ubahKeahlian(String bidang) {
        return bidangKeahlian = bidang;
    }
}
