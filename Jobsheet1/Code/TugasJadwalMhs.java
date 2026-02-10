package Jobsheet1.Code;

import java.util.Scanner;

public class TugasJadwalMhs {
    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal = new String[1][4];

    public static void showMenu() {
        System.out.println("===== MANAJEMEN JADWAL MHS =====");
        System.out.println("1. Input data jadwal kuliah");
        System.out.println("2. Tampilkan jadwal kuliah");
        System.out.println("3. Search jadwal berdasarkan hari");
        System.out.println("4. Search jadwal berdasarkan nama");
        System.out.println("5. Keluar");
        System.out.println("===============================");
    }

    public static void inputJadwal() {
        String[][] tempJadwal = new String[1][4];
        jadwal = new String[1 + 1][4];

        System.out.println("=== Input Jadwal ===");
        System.out.print("Masukkan nama mata kuliah:  ");
        tempJadwal[0][0] = sc.nextLine();
        System.out.print("Masukkan nama ruang: ");
        tempJadwal[0][1] = sc.nextLine();
        System.out.print("Masukkan hari: ");
        tempJadwal[0][2] = sc.nextLine();
        System.out.print("Masukkan jam: ");
        tempJadwal[0][3] = sc.nextLine();

        for (int i = 0; i < tempJadwal.length; i++) {
            for (int j = 0; j < 4; j++) {
                jadwal[i][j] = tempJadwal[i][j];
            }
        }

        System.out.println("Input Success\n");
    }

    public static void showJadwal() {
        if (jadwal[0][0] != null) {
            System.out.println("=== Show Jadwal ===");
            System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
            for (int i = 0; i < jadwal.length - 1; i++) {
                System.out.printf("%-20s %-10s %-10s %-10s%n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
            System.out.println();
        } else {
            System.out.println("Data Not Available!\n");
        }
    }

    public static void searchByDay() {
        System.out.println("=== Search By Day ===");
        System.out.print("Masukkan hari yang dicari: ");
        String hariTarget = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < jadwal.length - 1; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariTarget)) {
                if (!found) {
                    System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
                }
                System.out.printf("%-20s %-10s %-10s %-10s%n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                found = true;
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("Data not found!\n");
        }
    }

    public static void searchByName() {
        System.out.println("=== Search By Name ===");
        System.out.print("Masukkan nama yang dicari: ");
        String nameTarget = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < jadwal.length - 1; i++) {
            if (jadwal[i][0].equalsIgnoreCase(nameTarget)) {
                if (!found) {
                    System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
                }
                System.out.printf("%-20s %-10s %-10s %-10s%n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                found = true;
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("Data not found!\n");
        }
    }

    public static void main(String[] args) {
        do {
            showMenu();
            System.out.print("Masukkan pilihan (1 - 5): ");
            int noTarget = sc.nextInt();
            sc.nextLine();

            switch (noTarget) {
                case 1:
                    inputJadwal();
                    break;
                case 2:
                    showJadwal();
                    break;
                case 3:
                    searchByDay();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Eror! Nomor tidak valid\n");
                    break;
            }
            if (noTarget == 5) {
                break;
            }
        } while (true);

        sc.close();
    }
}
