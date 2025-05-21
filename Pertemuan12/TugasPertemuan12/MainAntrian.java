package Pertemuan12.TugasPertemuan12;

import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian antrian = new QueueAntrian();

        int pilihan;
        do {
            System.out.println("\n=== Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian masih tersedia.");
                    }
                    break;
                case 6:
                    antrian.printQueue();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang mengantri: " + antrian.getSize());
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}