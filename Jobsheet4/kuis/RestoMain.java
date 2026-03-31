package Jobsheet4.kuis;

import java.util.Scanner;

public class RestoMain {
    static int indexMenu = 0, indexPesanan = 0;
    static Resto[] dataMenu = new Resto[100];
    static Resto[] daftarPesanan = new Resto[100];

    public static void tampilkanMenuPil() {
        System.out.println("===== SISTEM RESTO =====");
        System.out.println("1. Input Menu Baru");
        System.out.println("2. Update Stok");
        System.out.println("3. Tampilkan Menu Resto");
        System.out.println("4. Input Pesanan");
        System.out.println("5. Tampilkan Pesanan");
        System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan (1-6): ");
    }

    public static void inputMenu(Scanner scanner) {
        System.out.println("=== Input Menu ===");
        System.out.print("Masukkan nama menu: ");
        String menu = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        float harga = scanner.nextFloat();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        dataMenu[indexMenu] = new Resto();
        dataMenu[indexMenu].addMenu(menu, harga, stok);

        System.out.println("Data berhasil ditambahkan");
        indexMenu++;
    }

    public static void updateStok(Scanner sc) {
        System.out.println("=== Update Stok ===");
        tampilkanMenuResto();
        
        System.out.print("Masukkan menu yang diupdate: ");
        String namaMenu = sc.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int stok = sc.nextInt();
        sc.nextLine();

        boolean isSucces = false;
        for (int i = 0; i < indexMenu; i++) {
            if (dataMenu[i].menu.equalsIgnoreCase(namaMenu)) {
                dataMenu[i].stok = stok;
                isSucces = true;
            }
        }
        if (isSucces)
            System.out.println("Data berhasil diupdate");
    }

    public static void tampilkanMenuResto() {
        if (indexMenu == 0) {
            System.out.println("Data Menu tidak ada!");
        } else {
            System.out.println("=== Menu Resto ===");
            System.out.printf("%-15s %-15s %-10s\n", "Nama Menu", "Harga", "Stok");
            for (int i = 0; i < indexMenu; i++) {
                System.out.printf("%-15s %-15.2f %-10d\n", dataMenu[i].menu, dataMenu[i].harga, dataMenu[i].stok);
            }
        }
    }

    public static int cariMenu(String menu) {
        for (int i = 0; i < indexMenu; i++) {
            if (dataMenu[i].menu.equalsIgnoreCase(menu)) {
                return i;
            }
        }
        return -1;
    }

    public static void inputPesanan(Scanner scanner) {
        String menu;
        tampilkanMenuResto();
        if (indexMenu != 0) {
            System.out.println("=== Input Pesanan ===");
            System.out.print("Masukkan nama menu: ");
            menu = scanner.nextLine();

            System.out.print("Masukkan jumlah: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();
            float harga = 0;

            int index = cariMenu(menu);
            if (index != -1) {
                harga = dataMenu[index].harga;
                int stokSebelum = dataMenu[index].stok;
                dataMenu[index].updateStok(stokSebelum - jumlah);
            } 
    
            daftarPesanan[indexPesanan] = new Resto();
            daftarPesanan[indexPesanan].addPesanan(menu, harga, jumlah);
    
            System.out.println("Data berhasil ditambahkan");
            indexPesanan++;
        }
    }

    public static float hitungTotalHarga() {
        float totalHarga = 0;

        for (int i = 0; i < indexPesanan; i++) {
            totalHarga += (daftarPesanan[i].harga * daftarPesanan[i].jumlahBeli);
        }
        return totalHarga;
    }

    public static void tampilkanPesanan() {
        if (indexPesanan == 0) {
            System.out.println("Data Pesanan tidak ada!");
        } else {
            System.out.println("=== Pesanan ===");
            System.out.printf("%-15s %-10s %-5s\n", "Nama Menu","Harga", "Jumlah");
            for (int i = 0; i < indexPesanan; i++) {
                System.out.printf("%-15s %-10.2f %-5d\n", daftarPesanan[i].menu, daftarPesanan[i].harga, daftarPesanan[i].jumlahBeli);
            }

            float totalHarga = hitungTotalHarga();
            System.out.println("Total harga: " + totalHarga);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            tampilkanMenuPil();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputMenu(sc);
                    break;
                case 2:
                    updateStok(sc);
                    break;
                case 3:
                    tampilkanMenuResto();
                    break;
                case 4:
                    inputPesanan(sc);
                    break;
                case 5:
                    tampilkanPesanan();
                    break;
                case 6:
                    System.out.println("Keluar dari program");
                    break;

                default:
                    break;
            }
            if (choice == 6) {
                break;
            }
        }
        sc.close();
    }
}
