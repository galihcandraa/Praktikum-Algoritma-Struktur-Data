package JobsheetCM2Edit.Model;

public class AntrianPesanan10 {
    public Node10 head;
    public Node10 tail;

    public AntrianPesanan10() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan10 data) {
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    public void print() {
        if (isEmpty()) {
            System.out.println( "Antrian masih kosong\n");
            return;
        }

        Node10 current = head;
        
        sortBynamaPesanan();
        
        while (current != null) {
            Pesanan10 currentPesanan = current.dataPesanan;
            System.out.printf("%-15d %-15s %-10d\n", currentPesanan.kodePesanan, currentPesanan.namaPesanan, currentPesanan.harga);
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.\n");
            return;
        }

        if (head == tail) {
            head = tail = null;
            System.out.println("Data Antrian berhasil dihapus.\n");
        } else {
            head = head.next;
            head.prev = null;
            System.out.println("Data Antrian berhasil dihapus.\n");
        }
    }

    public void sortBynamaPesanan() {
        Node10 current = head;
        Node10 currNext = null;
        Pesanan10 temp;

        while (current != null) {
            currNext = current.next;

            while (currNext != null) {
                int resultCompare = current.dataPesanan.namaPesanan.compareTo(currNext.dataPesanan.namaPesanan);
                
                if (resultCompare > 0) {
                    temp = current.dataPesanan;
                    current.dataPesanan = currNext.dataPesanan;
                    currNext.dataPesanan = temp;
                }

                currNext = currNext.next;
            }
            current = current.next;
        }
    }
}