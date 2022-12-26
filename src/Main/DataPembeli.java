/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Petugas;
import Model.Barang;
import Model.Pembeli;

/**
 *
 * @author dell
 */
public class DataPembeli {
    public static void main(String[] args) {
        /* INPUT BARANG PEMBELIAN */
        Barang barang1 = new Barang("Ultramilk", "1 dus");
        Barang barang2 = new Barang("BengBeng", "2 kotak");
        /* END INPUT BARANG PEMBELIAN */
        
        
        /* INPUT DATA PEMBELI */
        Pembeli pembeli1 = new Pembeli(barang1,"Via", "Malang");
        Pembeli pembeli2 = new Pembeli(barang2,"Alivia", "Malang");
        /* END INPUT DATA PEMBELI */
        
        /* INPUT NAMA PETUGAS DAN JUMLAH PEMBELIAN */
        Petugas petugas = new Petugas("Putri", 10);
        /* END INPUT NAMA PETUGAS DAN JUMLAH PEMBELIAN */
        
        petugas.tambahPembeli(pembeli1); //menambahkan data pembelian
        petugas.tambahPembeli(pembeli2); //menambahkan data pembelian
        petugas.hapusPembeli(); //menghapus data pembelian
        petugas.bacaPembeli(); //tampilkan pembelian
    }
}
