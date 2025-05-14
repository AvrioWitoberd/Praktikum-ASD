package TugasPrakt10;

import java.util.Scanner;

public class AntrianKRSMain {
    public static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Proses KRS (2 mahasiswa)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Paling Akhir");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Jumlah yang Sudah Diproses KRS");
        System.out.println("8. Kosongkan Antrian");
        System.out.println("9. Keluar");
        System.out.print("Pilih: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS queue = new QueueKRS();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh, tidak bisa menambahkan mahasiswa.");
                        break;
                    }
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Semester: ");
                    int smt = sc.nextInt(); sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, smt);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    queue.dequeueKRS();
                    break;

                case 3:
                    queue.printAll();
                    break;

                case 4:
                    queue.peek2Terdepan();
                    break;

                case 5:
                    queue.peekBelakang();
                    break;

                case 6:
                    queue.jumlahAntrian();
                    break;

                case 7:
                    queue.jumlahDiproses();
                    break;

                case 8:
                    queue.clear();
                    break;

                case 9:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 9);

        sc.close();
    }
}
