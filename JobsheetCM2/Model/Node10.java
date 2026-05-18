package JobsheetCM2.Model;

public class Node10 {
    public Pembeli10 dataPembeli;
    public Pesanan10 dataPesanan;
    public Node10 prev;
    public Node10 next;
    
    public Node10() {}

    public Node10(Pembeli10 dataPembeli) {
        this.dataPembeli = dataPembeli;
        this.prev = null;
        this.next = null;
    }

    public Node10(Pesanan10 dataPesanan) {
        this.dataPesanan = dataPesanan;
    }
}
