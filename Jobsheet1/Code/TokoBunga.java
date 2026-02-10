package Jobsheet1.Code;

public class TokoBunga {
    static int[][] stokToko = {{10, 5, 15, 7},
                    {6, 11, 9, 12},
                    {2, 10, 10, 5},
                    {5, 7, 12, 9}
                };
    static String[] namaToko = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[] totalPendapatanTiapToko = new int[4];

    public static void totalPendapatan() {
        for (int i = 0; i < stokToko.length; i++) {
            int total = 0;
            for (int j = 0; j < stokToko[i].length; j++) {
                total += stokToko[i][j] * hargaBunga[j];
            }
            totalPendapatanTiapToko[i] = total;
        }
    }

    public static void main(String[] args) {
        System.out.println("=============== TOKO BUNGA ===============");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n", "", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i= 0; i < stokToko.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d%n", namaToko[i], stokToko[0][i], stokToko[1][i], stokToko[2][i], stokToko[3][i]);
        }
        System.out.println("\n=======");
        System.out.println("Status");
        System.out.println("=======");
        
        String status;
        for (int i = 0; i < stokToko.length; i++) {
            totalPendapatan();
            if (totalPendapatanTiapToko[i] > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }
            System.out.println("Total pendapatan dari toko " + namaToko[i] + ": Rp. " + totalPendapatanTiapToko[i]);
            System.out.println("Status " + namaToko[i] + ": " + status);
        }
        System.out.println("===================================");
    }
}
