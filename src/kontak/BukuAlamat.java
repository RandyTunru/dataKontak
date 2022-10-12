package kontak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class BukuAlamat {
    DataAlamat[] koleksiKontak = new DataAlamat[100];

    private int search(String data){
        for(int i = 0; i < this.koleksiKontak.length; i++){
            if((this.koleksiKontak[i] != null) && data.equals(this.koleksiKontak[i].getNama())){
                return i;
            }
        }
        return -1;
    }

    void masukkanData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = scanner.next();
        System.out.print("Masukkan alamat : ");
        String alamat = scanner.next();
        System.out.print("Masukkan nomor telepon : ");
        String nomorTelp = scanner.next();
        System.out.print("Masukkan email : ");
        String email = scanner.next();

        if(search(nama) != -1){
            System.out.println("Data duplikat");
            return;
        }

        DataAlamat dataBaru = new DataAlamat(nama, alamat, nomorTelp, email);
        int index = -1;
        for (int i = 0; i < this.koleksiKontak.length; i++){
            if (this.koleksiKontak[i] == null){
                index = i;
            }
        }
        if (index == -1){
            System.out.println("Buku penuh");
            return;
        }
        this.koleksiKontak[index] = dataBaru;
    }

    void menghapusData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = scanner.next();
        int index = search(nama);
        if(index == -1){
            System.out.println("Data tidak ditemukan");
            return;
        }
        this.koleksiKontak[index] = null;
    }

    void menampilkanSeluruhData(){
        for (int i = 0; i < this.koleksiKontak.length; i++){
            if(this.koleksiKontak[i] != null){
                System.out.println("Nama : " + this.koleksiKontak[i].getNama());
                System.out.println("Alamat : " + this.koleksiKontak[i].getAlamat());
                System.out.println("Nomor Telepon : " + this.koleksiKontak[i].getNomorTelp());
                System.out.println("Email : " + this.koleksiKontak[i].getEmail());
                System.out.println();
            }
        }
    }

    void updateData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = scanner.next();
        int index = search(nama);
        if (index == -1){
            System.out.println("Data tidak ditemukan");
            return;
        }
        this.koleksiKontak[index] = null;
        masukkanData();
    }
}
