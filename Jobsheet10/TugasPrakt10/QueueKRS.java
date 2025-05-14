package TugasPrakt10;

public class QueueKRS {
    int max = 10;
    Mahasiswa[] antrian = new Mahasiswa[max];
    int front = -1, rear = -1, size = 0;
    int totalProses = 0; 

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = mhs;
            size++;
            System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
        }
    }

    public void dequeueKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak bisa proses KRS.");
        } else {
            System.out.println("Memproses 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa mhs = antrian[front];
                mhs.tampil();
                front = (front + 1) % max;
                size--;
                totalProses++;
            }
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian:");
            int i = front;
            for (int count = 0; count < size; count++) {
                antrian[i].tampil();
                i = (i + 1) % max;
            }
        }
    }

    public void peek2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            int i = front;
            for (int count = 0; count < 2; count++) {
                antrian[i].tampil();
                i = (i + 1) % max;
            }
        }
    }

    public void peekBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            antrian[rear].tampil();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses KRS: " + totalProses);
        System.out.println("Jumlah mahasiswa yang belum diproses KRS: " + (30 - totalProses));
    }
}
