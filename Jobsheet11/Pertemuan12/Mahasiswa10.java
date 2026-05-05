package Jobsheet11.Pertemuan12;

public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa10() {
    }

    public Mahasiswa10(String nm, String nama, String kls, double ip) {
        this.nim = nm;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nim + "\t\t" + nama + "\t\t" + kelas + "\t\t" + ipk);
    }
}