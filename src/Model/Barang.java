/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dell
 */
public class Barang {
    private String namaBarang, jumlahBarang; //deklarasi variable

    /* CONSTRUCTOR */
    public Barang(String namaBarang, String jumlahBarang) {
        this.namaBarang = namaBarang; //inisialisasi variable class dengan variable parameter
        this.jumlahBarang = jumlahBarang; //inisialisasi variable class dengan variable parameter
    }
    
    /* END CONSTRUCTOR */
    
    
    /* GETTER AND SETTER */
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    /* END GETTER AND SETTER */
    
    void TampilData(){ //method untuk mengoutputkan barang pembelian
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Jumlah Barang  : " + jumlahBarang);
    }
}
