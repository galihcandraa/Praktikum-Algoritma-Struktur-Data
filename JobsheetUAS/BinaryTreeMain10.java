package JobsheetUAS;

import java.util.Scanner;

public class BinaryTreeMain10 {
    static void tampilMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Cari berdasarkan nama");
        System.out.println("2. Cari top 3 IPK tertinggi");
        System.out.println("3. Cari & tampilkan mahasiswa dari kelas");
        System.out.print("Masukkan pilihan: ");
    }

    static void tambahData(BinaryTree10 bst) {
        bst.add(new Mahasiswa10("220101001", "Andi", "TI-1A", 3.95));
        bst.add(new Mahasiswa10("220101002", "Budi", "TI-1A", 3.20));
        bst.add(new Mahasiswa10("220101003", "Sinta", "TI-1B", 3.82));
        bst.add(new Mahasiswa10("220101004", "Rina", "TI-1B", 3.45));
        bst.add(new Mahasiswa10("220101005", "Dimas", "TI-1C", 2.75));
        bst.add(new Mahasiswa10("220101006", "Fajar", "TI-1C", 3.10));
        bst.add(new Mahasiswa10("220101007", "Nabila", "TI-1D", 3.76));
        bst.add(new Mahasiswa10("220101008", "Rizky", "TI-1D", 3.50));
        bst.add(new Mahasiswa10("220101009", "Aulia", "TI-1E", 3.88));
        bst.add(new Mahasiswa10("220101010", "Kevin", "TI-1E", 3.00));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree10 bst = new BinaryTree10();

        tambahData(bst);

        int pil;
        do {
            tampilMenu();
            pil = sc.nextInt();
            sc.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nm = sc.nextLine();

                    bst.searchByName(nm);
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println("=== Top 3 IPK Tertinggi ===");
                    bst.cari3IPKTertinggi();
                    System.out.println();
                    break;
            
                case 3:
                    System.out.print("Masukkan kelas: ");
                    String kelas = sc.nextLine();

                    System.out.println("=== List Mahasiswa dari kelas " + kelas + " ===");
                    bst.searchNPrintByClass(kelas);
                    System.out.println();
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid!\n");
                    break;
            }
        } while (pil != 0);
        sc.close();
    }
}