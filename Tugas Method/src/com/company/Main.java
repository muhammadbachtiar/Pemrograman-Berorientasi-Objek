package com.company;

class Kendaraan {

    // Atribut
    String jenisKendaraan;
    int jumlahRoda;
    String warna;
    String produsen;
    int tahunProduksi;
    int kapasitasPenumpang;
    int kecepatanMaksimal;

    //Konstruktor
    Kendaraan(String inputJenisKendaraan, int inputJumlahRoda, String inputWarna, String inputProdusen, int inputTahunProduksi, int inputKapasitasPenumpang, int inputKecepatanMaksimal) {

        jenisKendaraan = inputJenisKendaraan;
        jumlahRoda = inputJumlahRoda;
        warna = inputWarna;
        produsen = inputProdusen;
        tahunProduksi = inputTahunProduksi;
        kapasitasPenumpang = inputKapasitasPenumpang;
        kecepatanMaksimal = inputKecepatanMaksimal;
    }

    //Method
    // 1.Tanpa Parameter dan Tanpa Return
    void tampilSpesifikasiKendaraan() {
        System.out.println("SPESIFIKASI KENDARAAN");
        System.out.println("Jenis Kendaraan \t\t:\t" + this.jenisKendaraan);
        System.out.println("Jumlah Roda Kendaraan\t:\t" + this.jumlahRoda + " Roda");
        System.out.println("Warna Kendaraan \t\t:\t" + this.warna);
        System.out.println("Produsen Kendaraan \t\t:\t" + this.produsen);
        System.out.println("Tahun Produksi Kendaraan:\t" + this.tahunProduksi);
        System.out.println("Kapasitas Kendaraan \t:\t" + this.kapasitasPenumpang + " Orang");
        System.out.println("Kecepatan Maks Kendaraan:\t" + this.kecepatanMaksimal + " Km/Jam\n");
    }

    // 2.Dengan Parameter dan Tanpa Return
    void gantiWarnaKendaraan(String inputWarnaBaru) {
        this.warna = inputWarnaBaru;
    }

    void modifikasiKapasitasPenumpang(int inputMuatanBaru) {
        this.kapasitasPenumpang = inputMuatanBaru;
    }

    // 3.Tanpa Parameter dan Dengan Return
    String tampilPembuatKendaraan() {
        return "Kendaraan diproduksi oleh: " + this.produsen +"\n";
    }

    String tampilTahunProduksiKendaraan() {
        return "Kendaraan diproduksi pada tahun " + (this.tahunProduksi) +"\n";
    }

    // 4.Dengan Parameter dan Dengan Return
    String kondisiMesinKendaraan(String mesinKendaraan) {
        String kondisiMesin;

        if (mesinKendaraan.equals("menyala") || mesinKendaraan.equals("hidup") || mesinKendaraan.equals("on") )  {
            kondisiMesin = "Hidup";
        } else {
            kondisiMesin = "Mati" + "\nMasukan menyala/hidup/on jika kendaraan menyala";
        }
        return "Mesin kendaraan saat ini sedang " + kondisiMesin +"\n";

    }
}

public class Main {

    public static void main(String[] args) {

        //instansiasi
        Kendaraan kendaraan1 = new Kendaraan("Mobil",4,"Hitam","Toyota Indonesia",2020,8,100
        );

        //Panggil Method 1 Sebelum
        kendaraan1.tampilSpesifikasiKendaraan();

        //Pangggil Method 2
        kendaraan1.gantiWarnaKendaraan("Putih");
        kendaraan1.modifikasiKapasitasPenumpang(6);

        //Panggil Method 3
        System.out.println( kendaraan1.tampilPembuatKendaraan());
        System.out.println(kendaraan1.tampilTahunProduksiKendaraan());

        //Panggil Method 4
        System.out.println(kendaraan1.kondisiMesinKendaraan("mati"));

        //Panggil Method 1 Sesudah
        kendaraan1.tampilSpesifikasiKendaraan();
    }
}

