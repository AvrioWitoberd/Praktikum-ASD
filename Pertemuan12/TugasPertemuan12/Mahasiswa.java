package Pertemuan12.TugasPertemuan12;

public class Mahasiswa {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.printf("NIM: %s | Nama: %s | Keperluan: %s\n", nim, nama, keperluan);
    }
}
