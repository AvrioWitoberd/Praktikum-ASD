import java.util.Scanner;

public class MainSurat04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat04 stack = new StackSurat04(10); 
        int pilihan;

        do {
            System.out.println("\n=== Menu Pengelolaan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat         : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas            : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)    : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat04 surat = new Surat04(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println(">> Surat berhasil diterima.");
                    break;

                case 2:
                    Surat04 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println(">> Surat sedang diproses:");
                        suratDiproses.tampilkan();
                        System.out.println(">> Surat berhasil diperoses");
                    }
                    break;

                case 3:
                    Surat04 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println(">> Surat izin terakhir:");
                        suratTerakhir.tampilkan();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cariNama);
                    if (ditemukan) {
                        System.out.println(">> Surat ditemukan untuk mahasiswa bernama " + cariNama);
                    } else {
                        System.out.println(">> Tidak ada surat dengan nama tersebut.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
