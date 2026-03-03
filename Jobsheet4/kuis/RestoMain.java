package Jobsheet4.kuis;

import java.util.Scanner;

public class RestoMain {
    
    public static void tampilkanMenuPil() {
        System.out.println("===== SISTEM RESTO =====");
        System.out.println("1. Input Menu Baru");
        System.out.println("2. Update Stok");
        System.out.println("3. Tampilkan Menu");
        System.out.println("4. Input Pesanan");
        System.out.println("5. Tampilkan Pesanan");
        System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan (1-6): ");
    }

    public static void inputMenu(Resto[] dataMenu, Scanner scanner) {
        System.out.println("=== Input Menu ===");
        System.out.print("Masukkan nama menu: ");
        String menu = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        float harga = scanner.nextFloat();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < dataMenu.length; i++) {
            dataMenu[i] = new Resto();
            dataMenu[i].addMenu(menu, harga, stok);
        }
    }

    public static void updateStok(Resto[] dataMenu, Scanner sc) {
        System.out.println("=== Update Stok ===");
        tampilkanMenuResto(dataMenu);
        System.out.print("Masukkan menu yang diupdate: ");
        String namaMenu = sc.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int stok = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < dataMenu.length; i++) {
            if (dataMenu[i].menu.equalsIgnoreCase(namaMenu)) {
                dataMenu[i].stok = stok;
            }
        }
    }

    public static void tampilkanMenuResto(Resto[] menu) {
        if (menu.length == 0) {
            System.out.println("Data tidak ada!");
        } else {
            System.out.println("=== Menu ===");
            System.out.printf("%-15s %-15s %-10s\n", "Nama Menu", "Harga", "Stok");
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%-15s %-15.2f %-10d\n", menu[i].menu, menu[i].harga, menu[i].stok);
            }
        }
    }

    public static void inputPesanan( Resto[] dataMenu, Scanner scanner) {
        for (int i = 0; i < dataMenu.length; i++) {
            System.out.println("=== Input Pesanan ===");
            System.out.print("Masukkan nama menu: ");
            String menu = scanner.nextLine();
            System.out.print("Masukkan harga: ");
            float harga = scanner.nextFloat();
            System.out.print("Masukkan stok: ");
            int stok = scanner.nextInt();
            scanner.nextLine();

            dataMenu[i] = new Resto();
            dataMenu[i].addMenu(menu, harga, stok);
        }
    }

    public static float hitungTotalHarga(Resto[] daftarPesanan) {
        float totalHarga = 0;

        for (int i = 0; i < daftarPesanan.length; i++) {
            totalHarga += daftarPesanan[i].harga;
        }
        return totalHarga;
    }

    public static void tampilkanPesanan(Resto[] data) {
        if (data.length == 0) {
            System.out.println("Data tidak ada!");
        } else {
            System.out.println("=== Pesanan ===");
            System.out.printf("%-15s %-15s\n", "Nama Menu", "Harga");
            for (int i = 0; i < data.length; i++) {
                System.out.printf("%-15s %-10.2f\n", data[i].menu, data[i].harga);
            }

            float totalHarga = hitungTotalHarga(data);
            System.out.println("Total harga: " + totalHarga);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kolomMenu, kolomPesanan;

        System.out.print("Masukkan jumlah menu: ");
        kolomMenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan jumlah pesanan pembeli: ");
        kolomPesanan = sc.nextInt();
        sc.nextLine();
        
        Resto[] dataMenu = new Resto[kolomMenu];
        Resto[] daftarPesanan = new Resto[kolomPesanan];



        
        while (true) {
            tampilkanMenuPil();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputMenu(dataMenu, sc);
                    break;
                case 2:
                    updateStok(dataMenu, sc);
                    break;
                case 3:
                    tampilkanMenuResto(dataMenu);
                    break;
                case 4:
                    inputPesanan(daftarPesanan, sc);
                    break;
                case 5:
                    tampilkanPesanan(daftarPesanan);
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
