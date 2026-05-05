package Jobsheet11.Pertemuan12;

import java.util.Scanner;

public class SLLMain10 {

    // static Mahasiswa10 inputData(Scanner sc) {
    //     System.out.println("=== Data Mahasiswa ===");
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan ipk: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine();

    //     Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
    //     return mhs;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList10 sll = new SingleLinkedList10();

        Mahasiswa10 mhs1 = new Mahasiswa10("101", "Alvaro", "TI 1A", 4);
        Mahasiswa10 mhs2 = new Mahasiswa10("102", "Bimon", "TI 3C", 3.5);
        Mahasiswa10 mhs3 = new Mahasiswa10("103", "Cintia", "TI 2B", 3.8);
        Mahasiswa10 mhs4 = new Mahasiswa10("104", "Dirga", "TI 4D", 3.6);

        // sll.print();
        sll.addFirst(mhs4);
        // sll.print();
        sll.addLast(mhs1);
        // sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        // sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
        // int pil;
        // do {
        //     System.out.println("=== Menu ===");
        //     System.out.println("1. Tambahkan dari depan");
        //     System.out.println("2. Tambahkan dari belakang");
        //     System.out.println("3. Tambahkan setelah node");
        //     System.out.println("4. Tambahkan pada indeks");
        //     System.out.println("5. Cetak data");
        //     System.out.println("0. Keluar");
        //     System.out.print("Masukkan Pilihan (0-5): ");
        //     pil = sc.nextInt();
        //     sc.nextLine();
    
        //     Mahasiswa10 mhs;
        //     if (pil > 0 && pil <= 5) {
        //         switch (pil) {
        //             case 1:
        //                 mhs = inputData(sc);
        //                 sll.addFirst(mhs);
        //                 System.out.println();
        //                 break;
    
        //             case 2:
        //                 mhs = inputData(sc);
        //                 sll.addLast(mhs);
        //                 System.out.println();
        //                 break;
    
        //             case 3:
        //                 System.out.print("Masukkan nama mahasiswa sebelumnya: ");
        //                 String key = sc.nextLine();
                        
        //                 mhs = inputData(sc);

        //                 sll.insertAfter(key, mhs);
        //                 System.out.println();
        //                 break;
    
        //             case 4:
        //                 System.out.print("Masukkan indeks: ");
        //                 int idx = sc.nextInt(); 
        //                 sc.nextLine();
                        
        //                 mhs = inputData(sc);
    
        //                 sll.insertAt(idx, mhs);
        //                 System.out.println();
        //                 break;
    
        //             case 5:
        //                 sll.print();
        //                 System.out.println();
        //                 break;
    
        //             case 0:
        //                 System.out.println("Keluar");
        //                 break;
    
        //             default:
        //                 System.out.println("Pilihan tidak valid.\n");
        //                 break;
        //         }
        //     }
        // } while (pil != 0);

        sc.close();
    }
}
