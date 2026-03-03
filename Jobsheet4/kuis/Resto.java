package Jobsheet4.kuis;

public class Resto {
    
    String menu;
    float harga;
    int stok;

    Resto() {
    }

    Resto(String menu, float harga, int stok) {
        this.menu = menu;
        this.harga = harga;
        this.stok = stok;
    }

    public void addMenu(String menu, float harga, int stok) {
        this.menu = menu;
        this.harga = harga;
        this.stok = stok;
    }

    public void addPesanan(String menu, float harga, int stok) {
        this.menu = menu;
        this.harga = harga;
        this.stok = stok;
    }

    public void updateStok(int jumlah) {
        this.stok = jumlah;
    }
}
