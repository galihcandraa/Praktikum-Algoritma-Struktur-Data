package Jobsheet11.Pertemuan12.Tugas;

public class AntrianLayanan10 {
    Node10 head;
    Node10 tail;
    int size = 0;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node10 tmp = head;
            System.out.println("=== Data Antrian ===");
            while (tmp != null) {
                tmp.data.tampilkanData();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void clear() {
        if (head != null && tail != null) {
            head = null;
            tail = null;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void addLast(Mahasiswa10 input) {
        Node10 ndInput = new Node10(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public void getData(int index) {
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilkanData();
    }

    public void getDataTail() {
        Node10 tmp = tail;
        tmp.data.tampilkanData();
    }

    public int getJmlAntrian() {
        return size;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat melayani!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        System.out.println("Antrian berhasil dilayani.");
    }
}
