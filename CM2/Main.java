package CM2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Antrian antrian = new Antrian();
        QueueTransaksi queue = new QueueTransaksi(100);

        int pilihan;

        do {
            System.out.println("\n=== Menu Klinik ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("NIK Pasien: ");
                    String nik = input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();
                    Pasien p = new Pasien(nama, nik, keluhan);
                    antrian.tambahPasien(p);
                    System.out.println(">> Pasien masuk ke dalam antrian");
                    break;

                case 2:
                    System.out.println("-- Antrian Pasien --");
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    Pasien dilayani = antrian.layaniPasien();
                    if (dilayani != null) {
                        System.out.println("Pasien " + dilayani.nama + " Dipanggil");
                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = input.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = input.nextLine();
                        Dokter d = new Dokter(idDokter, namaDokter);
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int durasi = input.nextInt();
                        input.nextLine(); 
                        TransaksiLayanan t = new TransaksiLayanan(dilayani, d, durasi);
                        queue.enqueue(t);
                        System.out.println(">> Pasien telah dilayani, Transaksi berhasil dicatat.\n");
                    }
                    break;

                case 4:
                    int sisa = antrian.hitungSisaAntrian();
                    System.out.println(">> Sisa pasien dalam antrian: " + sisa);
                    break;

                case 5:
                    queue.tampilkanSemuaTransaksi();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        input.close();
    }
}
