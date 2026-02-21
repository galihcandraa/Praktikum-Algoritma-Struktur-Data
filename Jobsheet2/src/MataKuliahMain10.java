public class MataKuliahMain10 {
    public static void main(String[] args) {
        
        MataKuliah10 matkul1 = new MataKuliah10();
        matkul1.nama = "Algoritma Struktur Data";
        matkul1.kodeMk = "ASD";
        matkul1.sks = 4;
        matkul1.jumlahJam = 8;
        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(4);
        matkul1.kurangJam(2);

        MataKuliah10 matkul2 = new MataKuliah10("Konsep Teknologi Informasi", "KTI", 2, 4);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(3);
        matkul2.tambahJam(4);
        matkul2.kurangJam(2);
    }
}
