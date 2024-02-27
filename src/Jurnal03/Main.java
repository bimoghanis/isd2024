package Jurnal03;


import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedlist = new SinglyLinkedList<>();
        Scanner input = new Scanner(System.in);
        String subJawaban;
        String jawaban;

        boolean looping = true;

       while(looping) {

            System.out.println("Pilihlah Menu Di Bawah :");
            System.out.println("1. Input Data ");
            System.out.println("2. Hapus Data ");
            System.out.println("3. Cetak List Pegawai ");
            System.out.println("4. Keluar ");

            int angka = input.nextInt();

            if (angka == 1) {

                System.out.println("Masukkan Data :NIP, Nama, dan Divisi Pegawai");
                String nip = input.next();
                String nama = input.next();
                String divisi = input.next();

                System.out.println("Tambahkan data di awal list (y)");
                System.out.println("Tambahkan data di akhir list (n)");
                jawaban = input.next();

                if (Objects.equals(jawaban, "y")) {
                    linkedlist.insertAtFront(new Pegawai(nip, nama, divisi));
                } else if (Objects.equals(jawaban, "n")) {
                   linkedlist.insertAtBack(new Pegawai(nip, nama, divisi));
                }
            } else if (angka == 2) {
                System.out.println("Hapus data di awal list (y)");
                System.out.println("Hapus data di akhir list (n)");
                subJawaban = input.next();

                if (Objects.equals(subJawaban, "y")) {
                    linkedlist.removeFromFront();
                } else if (Objects.equals(subJawaban, "n")) {
                    linkedlist.removeFromBack();
                }
            } else if (angka == 3) {
                linkedlist.print();
            } else if (angka == 4) {
                break;
            }
        }
    }
}