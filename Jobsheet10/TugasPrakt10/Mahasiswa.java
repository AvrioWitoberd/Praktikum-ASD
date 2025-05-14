package TugasPrakt10;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    int semester;

    public Mahasiswa(String nim, String nama, String prodi, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.semester = semester;
    }

    public void tampil() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Semester: " + semester);
        System.out.println("----------------------");
    }
}