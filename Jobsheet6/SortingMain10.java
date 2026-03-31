package Jobsheet6;

public class SortingMain10 {
    
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        Sorting10 dataurut1 = new Sorting10(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}
