package Jobsheet6;

public class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen10() {
    }
    
    Dosen10(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }
}
