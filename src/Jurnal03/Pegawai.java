package Jurnal03;

public class Pegawai{
    private String nip;
    private String nama;
    private String divisi;
    public Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }
    public String getNip() {
        return divisi;
    }
    @Override
    public String toString() {
        return "NIP = '" + nip + '\'' +
                ", nama = '" + nama + '\'' +
                ", Divisi ='" + divisi + '\''
                ;
    }
}
