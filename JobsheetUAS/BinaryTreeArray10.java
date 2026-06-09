package JobsheetUAS;

public class BinaryTreeArray10 {
    Mahasiswa10[] data;
    int idxLast;

    public BinaryTreeArray10(int size) {
        data = new Mahasiswa10[size];
        idxLast = -1;
    }
    
    void populateData(Mahasiswa10[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);

                data[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa10 data) {
        this.data[++idxLast] = data;
    }
}
