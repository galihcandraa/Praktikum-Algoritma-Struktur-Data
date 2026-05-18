package JobsheetCM2.Model;

public class Pembeli10 {
    public String namaPembeli;
    public String noHp;
    public int noAntri;

    public Pembeli10(int noAntri, String nama, String no) {
        namaPembeli = nama;
        noHp = no;
        this.noAntri = noAntri;
    }

    public void tampilPembeli() {
        System.out.printf("%-15d %-10s %-12s\n", noAntri, namaPembeli, noHp);
    }
}
