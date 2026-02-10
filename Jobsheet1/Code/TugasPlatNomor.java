package Jobsheet1.Code;
import java.util.Scanner;
public class TugasPlatNomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.println("===== SISTEM PENCARI KOTA BERDASARKAN PLAT NOMOR =====");
        System.out.print("Masukkan plat nomor: ");
        char platTarget = sc.next().charAt(0);
        char platTargetUpper = Character.toUpperCase(platTarget);

        int index = 0;
        for (int i = 0; i < KODE.length; i++) {
            if (platTargetUpper == KODE[i]) {
                index = i;
            }
        }

        System.out.print("Kota dari plat tersebut: ");
        System.out.println(KOTA[index]);

        sc.close();
    }
}
