package Jobsheet3.src;

public class DataDosen10 {

    public void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode           : " + arrayOfDosen[i].kode);
            System.out.println("Nama           : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin  : " + arrayOfDosen[i].jenisKelamin);
            System.out.println("Usia           : " + arrayOfDosen[i].usia);
            System.out.println("-------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int jumlahPria = 0, jumlahPerempuan = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahPria++;
            } else if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("Wanita")) {
                jumlahPerempuan++;
            }
        }
        System.out.println("Jumlah Dosen pria: " + jumlahPria);
        System.out.println("Jumlah Dosen wanita: " + jumlahPerempuan);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        float rata2UsiaPria = 0, rata2UsiaWanita = 0;
        float jumlahUsiaPria = 0, jumlahUsiaWanita = 0;
        int totalPria = 0, totalWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahUsiaPria += arrayOfDosen[i].usia;
                totalPria++;
            } else if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("Wanita")) {
                jumlahUsiaWanita += arrayOfDosen[i].usia;
                totalWanita++;
            } 
        }
        if (totalPria > 0) {
            rata2UsiaPria = jumlahUsiaPria / totalPria;
        }
        if (totalWanita > 0) {
            rata2UsiaWanita = jumlahUsiaWanita / totalWanita; 
        }

        System.out.println("Rata-rata usia dosen pria: " + rata2UsiaPria);
        System.out.println("Rata-rata usia dosen wanita: " + rata2UsiaWanita);
    }

    public void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 dosenTertua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua.usia) {
                dosenTertua = arrayOfDosen[i];
            }
        }
        System.out.println("Data Dosen tertua: ");
        System.out.println("Kode           : " + dosenTertua.kode);
        System.out.println("Nama           : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin  : " + dosenTertua.jenisKelamin);
        System.out.println("Usia           : " + dosenTertua.usia);
        System.out.println("-------------------------");
    }
    
    public void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 dosenTermuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenTermuda.usia) {
                dosenTermuda = arrayOfDosen[i];
            }
        }
        System.out.println("Data Dosen termuda: ");
        System.out.println("Kode           : " + dosenTermuda.kode);
        System.out.println("Nama           : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin  : " + dosenTermuda.jenisKelamin);
        System.out.println("Usia           : " + dosenTermuda.usia);
        System.out.println("-------------------------");
    }
}
