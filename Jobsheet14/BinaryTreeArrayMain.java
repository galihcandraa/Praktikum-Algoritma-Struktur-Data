package Jobsheet14;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {

        BinaryTreeArray10 bta = new BinaryTreeArray10();

        Mahasiswa10 m1 = new Mahasiswa10("244160121", "Ali", "A", 3.57);
        Mahasiswa10 m2 = new Mahasiswa10("244160185", "Candra", "C", 3.41);
        Mahasiswa10 m3 = new Mahasiswa10("244160221", "Badar", "B", 3.75);
        Mahasiswa10 m4 = new Mahasiswa10("244160220", "Dewi", "B", 3.35);
        Mahasiswa10 m5 = new Mahasiswa10("244160131", "Devi", "A", 3.48);
        Mahasiswa10 m6 = new Mahasiswa10("244160205", "Ehsan", "D", 3.61);
        Mahasiswa10 m7 = new Mahasiswa10("244160170", "Fizi", "B", 3.86);

        Mahasiswa10[] dataMahasiswa = {
            m1, m2, m3, m4, m5, m6, m7
        };

        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInOrder Traversal Binary Tree:");
        bta.traverseInOrder(0);
    }
}
