package Jobsheet1.Code;
import java.util.Scanner;
public class MenghitungIPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan berapa banyak mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        String[] namaMatkul = new String[jmlMatkul];
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("- Nama matkul ke " + (i + 1) + ": ");
            namaMatkul[i] = sc.nextLine();
        }

        System.out.println("Masukkan nilai mata kuliah: ");
        float[] nilaiMatkul = new float[jmlMatkul];
        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.print("- Nilai angka untuk MK " + namaMatkul[i] + ": ");
            nilaiMatkul[i] = sc.nextInt();
        }

        System.out.println("Masukkan SKS mata kuliah: ");
        int[] sksMatkul = new int[jmlMatkul];
        for (int i = 0; i < sksMatkul.length; i++) {
            System.out.print("- SKS untuk MK " + namaMatkul[i] + ": ");
            sksMatkul[i] = sc.nextInt();
        }

        String[] nilHuruf = new String[jmlMatkul];
        for (int i = 0; i < nilaiMatkul.length; i++) {
            nilHuruf[i] = (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) ? "A" :
                    (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) ? "B+" :
                    (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) ? "B" :
                    (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) ? "C+" :
                    (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) ? "C" :
                    (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) ? "D" :
                    (nilaiMatkul[i] >= 0 && nilaiMatkul[i] <= 39) ? "E" : "Nilai tidak valid";
        }

        double[] bobotNilai = new double[jmlMatkul];
        for (int i = 0; i < nilHuruf.length; i++) {
            bobotNilai[i] = (nilHuruf[i].equals("A")) ? 4 :
                            (nilHuruf[i].equals("B+")) ? 3.5 :
                            (nilHuruf[i].equals("B")) ? 3 :
                            (nilHuruf[i].equals("C+")) ? 2.5 : 
                            (nilHuruf[i].equals("C")) ? 2 :
                            (nilHuruf[i].equals("D")) ? 1 : 0;
        }

        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        
        String format = "%-20s | %-11.2f | %-11s | %-10d | %-11.2f%n";
        float totalBobotNil = 0, totalSKS = 0;

        System.out.printf("%-20s | %-10s | %-10s | %-10s | %-10s%n", "Mata kuliah", "Nilai Angka", "Nilai Huruf", "SKS", "Bobot Nilai");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf(format, namaMatkul[i], nilaiMatkul[i], nilHuruf[i], sksMatkul[i], bobotNilai[i]);
            totalBobotNil += bobotNilai[i] * sksMatkul[i];
            totalSKS += sksMatkul[i]; 
        }

        float ip = totalBobotNil / totalSKS;
        System.out.println("====================");
        System.out.println("IP : " + ip);
        sc.close();
    }
}
