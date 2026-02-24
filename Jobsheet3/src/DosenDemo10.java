import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kolom data dosen: ");
        int kolom = sc.nextInt();
        sc.nextLine();

        Dosen10[] dataDosen = new Dosen10[kolom];
        DataDosen10 newDataDosen = new DataDosen10();
        String kode = null, nama = null, jenisKelamin = null;
        int usia = 0;

        for (int i = 0; i < dataDosen.length; i++) {
            System.out.println("Tambah data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------");

            dataDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }

        // tampil semua
        newDataDosen.dataSemuaDosen(dataDosen);

        // jumlah dosen per jenis kelamin
        newDataDosen.jumlahDosenPerJenisKelamin(dataDosen);

        // rerata usia dosen per jenis kelamin
        newDataDosen.rerataUsiaDosenPerJenisKelamin(dataDosen);
        
        // dosen tertua
        newDataDosen.infoDosenPalingTua(dataDosen);

        // dosen termuda
        newDataDosen.infoDosenPalingMuda(dataDosen);

        sc.close();
    }
}
