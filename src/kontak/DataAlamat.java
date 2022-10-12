package kontak;

public class DataAlamat {
    String nama = "";
    String alamat;
    String nomorTelp;
    String email;

    DataAlamat(String nama, String alamat, String nomorTelp, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelp = nomorTelp;
        this.email = email;
    }

    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return this.nama;
    }

    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    String getAlamat(){
        return this.alamat;
    }

    void setNomorTelp(String nomorTelp){
        this.nomorTelp = nomorTelp;
    }
    String getNomorTelp(){
        return this.nomorTelp;
    }

    void setEmail(String email){
        this.email = email;
    }
    String getEmail(){
        return this.email;
    }
}
