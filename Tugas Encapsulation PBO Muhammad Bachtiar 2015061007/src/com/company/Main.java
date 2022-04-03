package com.company;

import javax.xml.crypto.Data;

//Kelas DataDiri Orang
class DataDiri{
    private String namaLengkap;
    private String NIK;
    private JenisKelamin jenisKelamin;
    private String alamatLengkap;
    private String tempatTanggallahir;
    private GolonganDarah golonganDarah;
    private String kewarganegaraan;
    private String pekerjaan;
    private Agama agama;
    private int usia;
    private int tahunKelahiran;


    //KONSTRUKTOR KELAS DATA DIRI
    public DataDiri (String inputNama){
        this.namaLengkap = inputNama;
        this.NIK = "-";
        this. alamatLengkap = "-";
        this.tempatTanggallahir = "-";
        this.kewarganegaraan = "-";
        this.pekerjaan = "-";


    }

    public DataDiri (String inputNama, String inputNIK, int inputTahunKelahiran, String inputKewarganegaraan, String inputPekerjaan){
        this.namaLengkap = inputNama;
        this.NIK = inputNIK;
        this. alamatLengkap = "-";
        this.tempatTanggallahir = "-";
        this.kewarganegaraan = inputKewarganegaraan;
        this.pekerjaan = inputPekerjaan;
        this.tahunKelahiran = inputTahunKelahiran;
    }

    public DataDiri (String inputNama, String inputNIK,JenisKelamin inputJenisKelamin,GolonganDarah inputGolonganDarah,Agama inputAgama, int inputTahunKelahiran){
        this.namaLengkap = inputNama;
        this.NIK = inputNIK;
        this.jenisKelamin = inputJenisKelamin;
        this. alamatLengkap = "-";
        this.tempatTanggallahir = "-";
        this.golonganDarah = inputGolonganDarah;
        this.kewarganegaraan = "-";
        this.pekerjaan = "-";
        this.agama = inputAgama;
        this.tahunKelahiran = inputTahunKelahiran;
    }

    public void display() {
        System.out.println("\t\t DATA DIRI ");
        System.out.println("Nama\t\t\t: " + this.namaLengkap);
        System.out.println("NIK\t\t\t\t: " + this.NIK);
        System.out.println("Jenis Kelamin\t: " + this.jenisKelamin.getJenisKelamin());
        System.out.println("Alamat\t\t\t: " + this.alamatLengkap);
        System.out.println("TTL\t\t\t\t: " + this.tempatTanggallahir);
        System.out.println("Golongan Darah\t: " + this.golonganDarah.getGolonganDarah());
        System.out.println("Kewarganegaraan\t: " + this.kewarganegaraan);
        System.out.println("Pekerjaan\t\t: " + this.pekerjaan);
        System.out.println("Agama\t\t\t: " + this.agama.getNamaAgama());
        System.out.println("Usia\t\t\t: +-" + this.getUsia() + this.usia + " Tahun\n");
    }

    public void tampilNama(){
        System.out.println("\nNama\t\t\t: " + getNamaLengkap());
    }

    public void tampilAlamat(){
        System.out.println("\n" + getNamaLengkap() + "\nAlamat\t\t\t: " + getAlamatLengkap());
    }

    public void tampilNIK(){
        System.out.println("\n" + getNamaLengkap() + "\nNIK\t\t\t\t: " + getNIK());
    }

    public void tampilPekerjaan(){
        System.out.println("\n" + getNamaLengkap() + "\nPekerjaan\t\t: " + getPekerjaan());
    }

    public void tampilKewarganegaraan(){
        System.out.println("\n" + getNamaLengkap() + "\nKewarganegaraan\t: " + getKewarganegaraan());
    }

    public void tampilTTL(){
        System.out.println("\n" + getNamaLengkap() + "\nTTL\t\t\t\t: " + getTempatTanggallahir());
    }


    //SETTER DATA DIRI
    public void setJenisKelamin(JenisKelamin jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setGolonganDarah(GolonganDarah golonganDarah){
        this.golonganDarah = golonganDarah;
    }

    public void setAgama(Agama agama){
        this.agama = agama;
    }

    public void setNamaLengkap( String inputNamaLengkap ){
        this.namaLengkap = inputNamaLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setTahunKelahiran(int tahunKelahiran) {
        this.tahunKelahiran = tahunKelahiran;
    }

    public void setTempatTanggallahir(String tempatTanggallahir) {
        this.tempatTanggallahir = tempatTanggallahir;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }


    // GETTER DATA DIRI
    public int getTahunKelahiran(){
        return  this.tahunKelahiran;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNIK() {
        return NIK;
    }

    public String getTempatTanggallahir() {
        return tempatTanggallahir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public double getUsia(){
        return 2022 - this.tahunKelahiran;
    }

}

//Kelas Jenis Kelamin
class JenisKelamin {
    private String jenisKelamin;

    public JenisKelamin(String inputJenisKelamin){
        this.jenisKelamin = inputJenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}

//Kelas Golongan Darah
class GolonganDarah {
    private String jenisGolonganDarah;

    public GolonganDarah(String inputGolonganDarah){
        this.jenisGolonganDarah = inputGolonganDarah;
    }

    public String getGolonganDarah() {
        return jenisGolonganDarah;
    }
}

//Kelas Agama
class Agama{
    private String namaAgama;

    public Agama (String inputNamaAgama){
        this.namaAgama = inputNamaAgama;
    }

    public String getNamaAgama() {
        return namaAgama;
    }
}

public class Main {

    public static void main(String[] args) {

        // INSTANSIASI JENIS KELAMIN
        JenisKelamin lakilaki = new JenisKelamin("Laki-Laki");
        JenisKelamin L = new JenisKelamin("Laki-Laki");
        JenisKelamin Pria = new JenisKelamin("Laki-Laki");

        JenisKelamin wanita = new JenisKelamin("Perempuan");
        JenisKelamin P = new JenisKelamin("Perempuan");
        JenisKelamin perempuan = new JenisKelamin("Perempuan");

        // INSTANSIASI GOLONGAN DARAH
        GolonganDarah A = new GolonganDarah("A");
        GolonganDarah a = new GolonganDarah("A");
        GolonganDarah B = new GolonganDarah("B");
        GolonganDarah b = new GolonganDarah("B");
        GolonganDarah O = new GolonganDarah("O");
        GolonganDarah o = new GolonganDarah("O");
        GolonganDarah AB = new GolonganDarah("AB");
        GolonganDarah ab = new GolonganDarah("AB");

        //INSTANSIASI AGAMA
        Agama islam = new Agama("ISLAM");
        Agama Protestan = new Agama("PROTESTAN");
        Agama Katolik = new Agama("KATOLIK");
        Agama Hindu = new Agama("HINDU");
        Agama Budha = new Agama("BUDDHA");
        Agama Khonghucu = new Agama("KHONGHUCU");

        //INSTANSIASI ORANG
        DataDiri orang1 = new DataDiri("ALI APRIANSYAH","1200302039402092",2001,"INDONESIA","MAHASISWA");
        DataDiri orang2 = new DataDiri("AULIA NUR ILAHI");


        //SET DAN GET DATA ORANG
        orang1.setAgama(islam);
        orang1.setGolonganDarah(a);
        orang1.setJenisKelamin(lakilaki);
        orang1.setAlamatLengkap("Jl Kenanga No 5 RT 3 RW 2 Kel.Pasar 3 Kec. Lawang Kidul Kota Pagar Alam Sumatera Selatan");

        orang2.setJenisKelamin(perempuan);
        orang2.setAgama(islam);
        orang2.setGolonganDarah(AB);
        orang2.setKewarganegaraan("INDONESIA");
        orang2.setTahunKelahiran(1995);
        orang2.setNIK("1759302039495729");
        orang2.setPekerjaan("WIRAUSAHAWAN");
        orang2.setTempatTanggallahir("Palembang,3-April-1995");


        //TAMPIL DATA
        orang1.display();
        orang2.display();

        orang1.tampilAlamat();
        orang2.tampilNIK();
        orang1.tampilNama();
        orang2.tampilPekerjaan();
        orang1.tampilKewarganegaraan();
        orang2.tampilTTL();




    }
}
