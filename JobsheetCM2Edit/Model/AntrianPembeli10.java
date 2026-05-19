package JobsheetCM2Edit.Model;

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

    public void addLast(Pembeli10 data, boolean isPrio) {
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            if (isPrio) {
                if (head.next != null && head.next.next != null) {
                    newNode.next = head.next.next;
                    if (head.next.next != null) {
                        head.next.next.prev = newNode;
                    }
                    newNode.prev = head.next;
                    head.next.next = newNode;
                    newNode.dataPembeli.noAntri = 3;
                } else {
                    newNode.next = head.next;
                    newNode.prev = head;
                    if (head.next != null) {
                        head.next.prev = newNode;
                    }
                    head.next = newNode;
                    newNode.dataPembeli.noAntri = 2;
                }

                Node10 current = newNode.next;
                while (current != null) {
                    current.dataPembeli.noAntri += 1;
                    current = current.next;
                }
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
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
            System.out.printf("%-15d %-10s %-12s\n", currentPembeli.noAntri, currentPembeli.namaPembeli,
                    currentPembeli.noHp);
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