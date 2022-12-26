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
public class Pembeli {
    private Barang barang; //Membuat objek baru yaitu class Barang
    private String namaPembeli, alamat; //Deklarasi variable

    /* CONSTRUCTOR */
    public Pembeli(Barang barang, String namaPembeli, String alamat) { 
        this.barang = barang; //inisialisasi variable class dengan variable parameter
        this.namaPembeli = namaPembeli; //inisialisasi variable class dengan variable parameter
        this.alamat = alamat; //inisialisasi variable class dengan variable parameter
    }
    /* END CONSTRUCTOR */

    
    /* GETTER AND SETTER */
    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    /* END GETTER AND SETTER */
    
    public void DataPembeli(){ //mengoutputkan data pembelian
        barang.TampilData(); //mengoutputkan barang pembelian melalui method TampilData yang ada di clas Barang
        System.out.println("Nama Pembeli   : " + namaPembeli); 
        System.out.println("Alamat Pembeli : " + alamat);
        System.out.println("");
    }
}
