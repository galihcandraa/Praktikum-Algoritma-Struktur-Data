package Jobsheet1.Code;
import java.util.Scanner;
public class DeretBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== DERET ANGKA =====");
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        
        long nimTerakhir = nim % 100;

        if (nimTerakhir < 10) {
            nimTerakhir += 10;
        }
        System.out.println("n = " + nimTerakhir);
        System.out.println("======================");
        for (int i = 1; i <= nimTerakhir; i++) {
            if (i == 10 || i == 15) {
                continue;
            } 
            else if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } 
        }
        System.out.println("\n======================");
        sc.close();
    }
}
