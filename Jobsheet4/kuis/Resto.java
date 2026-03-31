package Jobsheet4.kuis;

public class Resto {
    
    String menu;
    float harga;
    int stok;
    int jumlahBeli;

    Resto() {
    }

    public void addMenu(String menu, float harga, int stok) {
        this.menu = menu;
        this.harga = harga;
        this.stok = stok;
    }

    public void addPesanan(String menu, float harga, int jumlah) {
        this.menu = menu;
        this.harga = harga;
        this.jumlahBeli = jumlah;
    }

    public void updateStok(int jumlah) {
        this.stok = jumlah;
    }
}
