package JobsheetCM2Edit.Model;

public class Pembeli10 {
    public String namaPembeli;
    public String noHp;
    public int noAntri;
    public boolean isPrio;

    public Pembeli10(int noAntri, String nama, String no, boolean isPrio) {
        namaPembeli = nama;
        noHp = no;
        this.noAntri = noAntri;
        this.isPrio = isPrio;
    }

    public void tampilPembeli() {
        System.out.printf("%-15d %-10s %-12s\n", noAntri, namaPembeli, noHp);
    }
}
