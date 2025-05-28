package CM2;

public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = durasiLayanan * 50000;
    }

    public void tampilkanTransaksi() {
        System.out.println("=== Transaksi Layanan ===");
        pasien.tampilkanInformasi();
        System.out.println("Dokter     : " + dokter.nama);
        System.out.println("Durasi     : " + durasiLayanan + " jam");
        System.out.println("Biaya      : Rp" + biaya);
        System.out.println();
    }

    public String ringkasanTransaksi() {
        return pasien.nama + " (" + durasiLayanan + " jam): Rp " + biaya;
    }
}