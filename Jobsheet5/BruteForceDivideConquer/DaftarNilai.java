package Jobsheet5.BruteForceDivideConquer;

public class DaftarNilai {
    String nama;
    String nim;
    int tahunMasuk;
    float nilaiUTS;
    float nilaiUAS;
    
    DaftarNilai() {
    }
    
    DaftarNilai(String nama, String nim, int tahunMasuk, float nilaiUTS, float nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    float nilUTSTertinggi(DaftarNilai nilai[], int indexMin, int indexMax) {
        if (indexMin == indexMax) {
            return nilai[indexMin].nilaiUTS;
        } 

        int mid = (indexMin + indexMax) / 2;
        float leftNil = nilUTSTertinggi(nilai, indexMin, mid);
        float rightNil = nilUTSTertinggi(nilai, mid + 1, indexMax);
        
        if (leftNil > rightNil) {
            return leftNil;
        } else {
            return rightNil;
        }
    }

    float nilUTSTerendah(DaftarNilai nilai[], int indexMin, int indexMax) {
        if (indexMin == indexMax) {
            return nilai[indexMin].nilaiUTS;
        } 

        int mid = (indexMin + indexMax) / 2;
        float leftNil = nilUTSTerendah(nilai, indexMin, mid);
        float rightNil = nilUTSTerendah(nilai, mid + 1, indexMax);
        
        if (leftNil < rightNil) {
            return leftNil;
        } else {
            return rightNil;
        }
    }

    float rata2UAS(DaftarNilai[] nilai) {
        float total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i].nilaiUAS;
        }
        return total / nilai.length;
    }
}
