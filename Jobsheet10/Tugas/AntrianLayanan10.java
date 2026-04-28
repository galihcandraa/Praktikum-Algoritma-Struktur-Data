package Jobsheet10.Tugas;

public class AntrianLayanan10 {
    Mahasiswa10[] data;
    int max;
    int front;
    int rear;
    int size;
    int maxMhs;
    int jumlahSudahKRS;

    public AntrianLayanan10(int max, int maxMhs) {
        this.max = max;
        this.maxMhs = maxMhs;
        data = new Mahasiswa10[max];
        front = 0;
        rear = -1;
        size = 0;
        jumlahSudahKRS = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa10 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    public void layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        int jumlahDiproses = Math.min(2, size);

        System.out.println("Melayani " + jumlahDiproses + " mahasiswa:");
        for (int i = 0; i < jumlahDiproses; i++) {
            Mahasiswa10 mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahSudahKRS++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("2 Antrian Terdepan:");
        for (int i = 0; i < Math.min(2, size); i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatTerbelakang() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Antrian Terakhir:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return jumlahSudahKRS;
    }

    public int getJumlahBelumKRS() {
        return maxMhs - jumlahSudahKRS;
    }
}