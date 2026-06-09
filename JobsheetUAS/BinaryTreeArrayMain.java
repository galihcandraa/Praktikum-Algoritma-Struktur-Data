package JobsheetUAS;

import java.util.Scanner;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan size array: ");
        int sizeArr = sc.nextInt();
        BinaryTreeArray10 bta = new BinaryTreeArray10(sizeArr);

        Mahasiswa10 m1 = new Mahasiswa10("244160121", "Ali", "A", 3.57);
        Mahasiswa10 m2 = new Mahasiswa10("244160185", "Candra", "C", 3.41);
        Mahasiswa10 m3 = new Mahasiswa10("244160221", "Badar", "B", 3.75);
        Mahasiswa10 m4 = new Mahasiswa10("244160220", "Dewi", "B", 3.35);
        Mahasiswa10 m5 = new Mahasiswa10("244160131", "Devi", "A", 3.48);
        Mahasiswa10 m6 = new Mahasiswa10("244160205", "Ehsan", "D", 3.61);
        Mahasiswa10 m7 = new Mahasiswa10("244160170", "Fizi", "B", 3.86);

        bta.add(m1);
        bta.add(m2);
        bta.add(m3);
        bta.add(m4);
        bta.add(m5);
        bta.add(m6);
        bta.add(m7);

        System.out.println("\nInOrder Traversal Binary Tree:");
        bta.traverseInOrder(0);

        System.out.println("\nPreOrder Traversal Binary Tree:");
        bta.traversePreOrder(0);
        sc.close();
    }
}
