package Jobsheet14;

public class BinaryTreeArray10 {
    Mahasiswa10[] data;
    int idxLast;

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
}
