package Jobsheet5.BruteForceDivideConquer;

public class MainDaftarNilai {
    public static void main(String[] args) {
        DaftarNilai[] dataNilai = {
                new DaftarNilai("Ahmad", "220101001", 2022, 78, 82),
                new DaftarNilai("Budi", "220101002", 2022, 85, 88),
                new DaftarNilai("Cindy", "220101003", 2021, 90, 87),
                new DaftarNilai("Dian", "220101004", 2021, 76, 79),
                new DaftarNilai("Eko", "220101005", 2023, 92, 95),
                new DaftarNilai("Fajar", "220101006", 2020, 88, 85),
                new DaftarNilai("Gina", "220101007", 2023, 80, 83),
                new DaftarNilai("Hadi", "220101008", 2020, 82, 84)
        };
        
        System.out.println("======================================================");
        System.out.printf("%-10s %-12s %-12s %-10s %-10s\n",
        "Nama", "NIM", "TahunMasuk", "UTS", "UAS");
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.printf("%-10s %-12s %-12d %-10.2f %-10.2f\n",
            dataNilai[i].nama,
            dataNilai[i].nim,
            dataNilai[i].tahunMasuk,
            dataNilai[i].nilaiUTS,
            dataNilai[i].nilaiUAS);
        }
        System.out.println("======================================================");

        DaftarNilai nilai = new DaftarNilai();
        System.out.println("Nilai UTS Tertinggi: " + nilai.nilUTSTertinggi(dataNilai, 0, dataNilai.length - 1));
        System.out.println("Nilai UTS Terendah: " + nilai.nilUTSTerendah(dataNilai, 0, dataNilai.length - 1));
        System.out.println("Nilai rata-rata UAS: " + String.format("%.2f", nilai.rata2UAS(dataNilai)));

    }
}
