package Jobsheet6;

public class DataDosen10 {
    Dosen10[] dataDosen;
    int idx;

    DataDosen10(int jml) {
        dataDosen = new Dosen10[jml];
        idx = 0;
    }

    void tambah(Dosen10 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong.");
            return;
        }

        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            dataDosen[i].tampil();
            System.out.println("--------------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen10 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC (termuda ke tertua) dengan Bubble Sort.");
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen10 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan DSC (tertua ke termuda) dengan Selection Sort.");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen10 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data berhasil diurutkan dengan Insertion Sort.");
    }
}