package JobsheetCM2.Model;

public class AntrianPembeli10 {
    public Node10 head;
    public Node10 tail;

    public AntrianPembeli10() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli10 data) {
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
            System.out.println("Antrian masih kosong\n");
            return;
        }

        Node10 current = head;
        
        while (current != null) {
            Pembeli10 currentPembeli = current.dataPembeli;
            System.out.printf("%-15d %-10s %-12s\n", currentPembeli.noAntri, currentPembeli.namaPembeli, currentPembeli.noHp);
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
            System.out.println("Data Antrian Pembeli berhasil dihapus.");
        } else {
            head = head.next;
            head.prev = null;
            System.out.println("Data Antrian Pembeli berhasil dihapus.");
        }
    }
}