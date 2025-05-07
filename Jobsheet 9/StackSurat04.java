public class StackSurat04 {
    Surat04[] data;
    int top;

    public StackSurat04(int kapasitas) {
        data = new Surat04[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(Surat04 surat) {
        if (!isFull()) {
            data[++top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat baru.");
        }
    }

    public Surat04 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat04 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
