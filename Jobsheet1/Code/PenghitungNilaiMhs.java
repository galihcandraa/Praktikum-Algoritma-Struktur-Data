package Jobsheet1.Code;
import java.util.Scanner;
public class PenghitungNilaiMhs {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float nilTugas, nilKuis, nilUTS, nilUAS;

        System.out.println("=== PROGRAM MENGHITUNG NILAI AKHIR ===");
        while (true) {
            System.out.print("Masukkan nilai tugas: ");
            nilTugas = sc.nextFloat();
            if (nilTugas < 0 || nilTugas > 100) {
                System.out.println("Nilai tidak valid, Ulangi!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Masukkan nilai kuis: ");
            nilKuis = sc.nextFloat();
            if (nilKuis < 0 || nilKuis > 100) {
                System.out.println("Nilai tidak valid, Ulangi!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Masukkan nilai UTS: ");
            nilUTS = sc.nextFloat();
            if (nilUTS < 0 || nilUTS > 100) {
                System.out.println("Nilai tidak valid, Ulangi!");
                continue;
            }
            break;
        }
        
        while (true) {
            System.out.print("Masukkan nilai UAS: ");
            nilUAS = sc.nextFloat();
            if (nilUAS < 0 || nilUAS > 100) {
                System.out.println("Nilai tidak valid, Ulangi!");
                continue;
            }
            break;
        }
        
        double nilAkhir = (0.2 * nilTugas) + (0.2 * nilKuis) + (0.3 * nilUTS) + (0.3 * nilUAS);
        
        String nilHuruf;
            nilHuruf = (nilAkhir > 80 && nilAkhir <= 100) ? "A" :
                    (nilAkhir > 73 && nilAkhir <= 80) ? "B+" :
                    (nilAkhir > 65 && nilAkhir <= 73) ? "B" :
                    (nilAkhir > 60 && nilAkhir <= 65) ? "C+" :
                    (nilAkhir > 50 && nilAkhir <= 60) ? "C" :
                    (nilAkhir > 39 && nilAkhir <= 50) ? "D" :
                    (nilAkhir >= 0 && nilAkhir <= 39) ? "E" : "Nilai tidak valid";

        String status;
        status = (nilHuruf.equals("A") || nilHuruf.equals("B+") || nilHuruf.equals("B") || nilHuruf.equals("C+") || nilHuruf.equals("C")) ? "SELAMAT ANDA LULUS" : "MOHON MAAF ANDA TIDAK LULUS";

        System.out.println("\n===== HASIL STUDI =====");
        System.out.println("- Nilai akhir: " + nilAkhir);
        System.out.println("- Nilai huruf: " + nilHuruf);
        System.out.println("=======================");
        System.out.println(status);
        System.out.println("=======================");

        sc.close();
    }
}
