package Pertemuan12;

public class SLLMain04 {
    public static void main(String[] args) {
        SingleLinkedList04 sll = new SingleLinkedList04();

        Mahasiswa04 mhs1 = new Mahasiswa04("22212203", "Dirga", "4D", 3.6);
        Mahasiswa04 mhs2 = new Mahasiswa04("22212202", "Cintia", "3C", 3.5);
        Mahasiswa04 mhs3 = new Mahasiswa04("23212201", "Bimon", "2B", 3.8);
        Mahasiswa04 mhs4 = new Mahasiswa04("24212200", "Alvaro", "1A", 4.0);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
