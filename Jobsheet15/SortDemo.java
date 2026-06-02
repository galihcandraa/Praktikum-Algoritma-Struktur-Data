package Jobsheet15;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(201, "Della"));
        customers.add(new Customer(202, "Victor"));
        customers.add(new Customer(203, "Sarah"));

        customers.sort((c1,c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
