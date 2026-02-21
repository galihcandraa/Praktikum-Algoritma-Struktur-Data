public class DosenMain10 {
    public static void main(String[] args) {
        
        Dosen10 dosen1 = new Dosen10();
        dosen1.idDosen = "22314";
        dosen1.nama = "Eko";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Information Technology";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("IT");
        dosen1.tampilInformasi();
        System.out.println();

        Dosen10 dosen2 = new Dosen10("22315", "Sandhika", false, 2015, "IT");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Information Technology");
        dosen2.tampilInformasi();
    }
}