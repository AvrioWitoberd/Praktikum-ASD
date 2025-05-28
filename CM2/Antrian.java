package CM2;

public class Antrian {
    Node head;
    Node tail;

    public void tambahPasien(Pasien pasien) {
        Node baru = new Node(pasien);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public Pasien layaniPasien() {
        if (head == null) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return null;
        } else {
            Pasien pasienDilayani = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return pasienDilayani;
        }
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else {
            Node bantu = head;
            int nomor = 1;
            while (bantu != null) {
                
                System.out.println("Pasien #" + nomor);
                bantu.data.tampilkanInformasi();
                System.out.println();
                bantu = bantu.next;
                nomor++;
            }
        }
    }

    public boolean antrianKosong() {
        return head == null;
    }

    public int hitungSisaAntrian() {
        int jumlah = 0;
        Node bantu = head;
        while (bantu != null) {
        jumlah++;
        bantu = bantu.next;
    }
        return jumlah;
    }
}