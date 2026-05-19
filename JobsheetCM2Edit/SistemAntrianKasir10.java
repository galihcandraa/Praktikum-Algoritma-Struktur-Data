package JobsheetCM2Edit;

import java.util.Scanner;
import JobsheetCM2Edit.View.*;
import JobsheetCM2Edit.Model.*;

public class SistemAntrianKasir10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPembeli10 antrianBeli= new AntrianPembeli10();
        AntrianPesanan10 antrianPesan = new AntrianPesanan10();
        View10 view = new View10();

        int pil = 0;
        do {
            pil = view.cetakMenu(sc, pil);

            switch (pil) {
                case 1:
                    view.tambahAntriPembeli(sc, antrianBeli);
                    break;

                case 2:
                    view.cetakAntrian(antrianBeli);
                    break;

                case 3:
                    view.hapusNPesan(sc, antrianBeli, antrianPesan);
                    break;

                case 4:
                    view.laporanPesanan(antrianPesan);
                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid.\n");
                    break;
            }
        } while (pil != 0);

        sc.close();
    }
}
