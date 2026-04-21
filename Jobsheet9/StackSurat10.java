package Jobsheet9;

public class StackSurat10 {
    Surat10[] stack;
    int top;
    int size;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat10 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Surat10 cariBerdNama(String nama) {
        for (Surat10 s : stack) {
            if (s.namaMahasiswa.equalsIgnoreCase(nama)) {
                return s;
            } 
        }
        return null;
    }
}
