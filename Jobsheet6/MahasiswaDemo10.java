package Jobsheet6;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        Mahasiswa10 m1 = new Mahasiswa10("123", "Zidan", "2A", 3.2);
        Mahasiswa10 m2 = new Mahasiswa10("124", "Ayu", "2A", 3.5);
        Mahasiswa10 m3 = new Mahasiswa10("125", "Sofi", "2A", 3.1);
        Mahasiswa10 m4 = new Mahasiswa10("126", "Sita", "2A", 3.9);
        Mahasiswa10 m5 = new Mahasiswa10("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESCENDING)");
        list.bubbleSort();
        list.tampil();
    }
}
