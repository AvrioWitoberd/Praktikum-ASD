package Pertemuan13.Jobsheet12;

public class DoubleLinkedLists {
    Node01 head;
    Node01 tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev =newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        } if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan seelah NIM " + keyNim);
    }

    public void print() {
        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
