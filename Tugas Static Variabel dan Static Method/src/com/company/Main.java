package com.company;

class Lingkaran {
    // Static Variable
    static double phi = 3.14;

    //Properti
    private int jarijari;
    private double keliling;
    private double luas;
    private double diameter;

    //Konstruktor
    public Lingkaran(int inputJarijari){
        this.jarijari = inputJarijari;
        this.keliling = 0;
        this.luas = 0;
        this.diameter = jarijari * 2;
    }

    public void display(){
        System.out.println("\n\t\t Data Lingkaran ");
        System.out.println("Jari-Jari : " + this.jarijari);
        System.out.println("Diameter  : " + this.diameter);
        System.out.println("Luas \t  : " + this.luas);
        System.out.println("Keliling  : " + this.keliling);
        System.out.println("Nilai Phi : " + Lingkaran.phi );
    }

    //Static Method
    static public void tampilKeteranganLingkaran(){
        System.out.println("\n\t\tLINGKARAN\nMemiliki :\n 1.Titik Pusat \t: Sebuah titik yang berada tepat di tengah lingkaran.\n 2.Jari-jari \t: jarak antara titik pusat dan lingkaran.\n 3.Diameter \t: Garis lurus yang membagi dua lingkaran sama besar ");
    }

    static public void tampilRumusLingkaran(){
        System.out.println("\n\t\tRUMUS RUMUS LINGKARAN\n 1.Keliling \t: 2 X Phi X r  / Phi X d\n 2.Luas \t\t: Phi X r X r\n 3.Diameter \t: 2 X r ");
    }

    //Method
    public void hitungLuasLingkaran(){
        this.luas = jarijari * jarijari * phi;
    }

    public  void hitungKelilingLingkaran(){
        this.keliling = diameter * phi ;
    }


}

public class Main {

    public static void main(String[] args) {

        Lingkaran.tampilKeteranganLingkaran();
        Lingkaran.tampilRumusLingkaran();

        Lingkaran lingkaran1 = new Lingkaran(14);
        Lingkaran lingkaran2 = new Lingkaran(70);

        lingkaran2.hitungKelilingLingkaran();
        lingkaran2.hitungLuasLingkaran();

        lingkaran1.display();
        lingkaran2.display();
    }
}
