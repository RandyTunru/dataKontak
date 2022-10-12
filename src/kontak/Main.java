package kontak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BukuAlamat buku1 = new BukuAlamat();
        System.out.println("Menu buku alamat:\n1. Masukkan data\n2. Menghapus Data\n3. Menampilkan Data\n4. Update Data\n5. Keluar");
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.print("\nMasukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    buku1.masukkanData();
                    break;

                case 2:
                    buku1.menghapusData();
                    break;

                case 3:
                    buku1.menampilkanSeluruhData();
                    break;

                case 4:
                    buku1.updateData();
                    break;

                case 5:
                    System.out.print("\nKeluar dari program...\n");
                    System.exit(0);

                default:
                    System.out.println("Input yang dimasukkan tidak valid");
                    break;

            }

        } while(true);
    }
}
