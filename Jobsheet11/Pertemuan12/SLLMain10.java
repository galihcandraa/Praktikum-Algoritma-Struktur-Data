package Jobsheet11.Pertemuan12;

public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();
        Mahasiswa10 mhs1 = new Mahasiswa10("101", "Alvaro", "TI 1A", 4);
        Mahasiswa10 mhs2 = new Mahasiswa10("102", "Bimon", "TI 3C", 3.5);
        Mahasiswa10 mhs3 = new Mahasiswa10("103", "Cintia", "TI 2B", 3.8);
        Mahasiswa10 mhs4 = new Mahasiswa10("104", "Dirga", "TI 4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
