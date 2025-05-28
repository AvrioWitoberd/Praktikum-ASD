package CM2;

public class QueueTransaksi {
    TransaksiLayanan[] data;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        data = new TransaksiLayanan[kapasitas];
        front = rear = size = 0;
    }

    public void enqueue(TransaksiLayanan t) {
        if (size == data.length) {
            System.out.println("Queue transaksi penuh.");
        } else {
            data[rear] = t;
            rear = (rear + 1) % data.length;
            size++;
        }
    }

    public void tampilkanSemuaTransaksi() {
    if (size == 0) {
        System.out.println("Belum ada transaksi.");
    } else {
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        int i = front;
        int hitung = 0;
        while (hitung < size) {
            System.out.println(data[i].ringkasanTransaksi());
            i = (i + 1) % data.length;
            hitung++;
        }
    }
}
}