package Jobsheet11.Pertemuan12.Tugas;
import java.util.Scanner;

public class LayananAkademikMhs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianLayanan10 antrian = new AntrianLayanan10();
        int pilihan;
        
        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Cek Antrian");
            System.out.println("2. Tambah Antrian Mahasiswa");
            System.out.println("3. Layanan Mahasiswa");
            System.out.println("4. Lihat Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terbelakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            int nextPil1;

            switch (pilihan) {
                case 1:
                    do {
                        System.out.println("1. Cek antrian kosong");
                        System.out.println("2. Cek antrian penuh");
                        System.out.println("3. Mengosongkan antrian");
                        System.out.println("0. Kembali");
                        System.out.print("Masukkan pilihan: ");
                        nextPil1 = sc.nextInt();
                        sc.nextLine();
    
                        switch (nextPil1) {
                            case 1:
                                System.out.println(antrian.isEmpty() ? "Antrian kosong.\n" : "Antrian sudah ada isinya.\n");    
                                break;
                        
                            case 2:
                                System.out.println("Tidak bisa penuh karena linked list bersifat dinamis.\n");
                                break;
    
                            case 3:
                                antrian.clear();
                                break;
    
                            case 0:
                                System.out.println("Kembali.");
                                break;
                                
                            default:
                                System.out.println("Pilihan tidak valid!\n");
                                break;
                        }
                    } while (nextPil1 != 0);
                    break;

                case 2:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi     : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = sc.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama, prodi, kelas);
                    antrian.addLast(mhs);
                    break;
            
                case 3:
                    antrian.removeFirst();
                    break;
            
                case 4:
                    antrian.getData(0);
                    break;
            
                case 5:
                    antrian.getDataTail();
                    break;
            
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJmlAntrian());
                    antrian.print();
                    break;
            
                case 0:
                    System.out.println("Terima kasih.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
