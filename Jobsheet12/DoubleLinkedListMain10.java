package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain10 {
    
    static public Mahasiswa10 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan nama   : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan kelas  : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan ipk    : ");
        double ipk = sc.nextDouble();
        Mahasiswa10 data = new Mahasiswa10(nim, nama, kelas, ipk);
        return data;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList10 list = new DoubleLinkedList10();
        int pil = 0;

        do {
            System.out.println("\n ===== MENU DOUBLE LINKED LIST");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pil = sc.nextInt();
            sc.nextLine();

            switch (pil) {
                case 1:
                    Mahasiswa10 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa10 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa10 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 4:
                    // list.removeFirst();
                    break;

                case 5:
                    // list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pil != 0);

        sc.close();
    }
}
