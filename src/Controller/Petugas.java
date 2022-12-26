/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pembeli; //mengimport Class Pembeli pada folder Model

/**
 *
 * @author dell
 */
public class Petugas {
    private String namaPetugas; //Deklarasi variable
    private Pembeli[] pembeli; //Membuat Objek Baru yaitu class Pembeli dan berisikan array
    private int index, jumlah;//Deklarasi variable
    
    public void bacaPembeli(){ //mengouputkan hasil akhir pembelian serta petugas
        System.out.println("Nama Petugas : " + namaPetugas +"\n");
        
        /* OUTPUT UNTUK PEMBELIAN */
        for(int i = 0; i<= index; i++){
            pembeli[i].DataPembeli();
        }
        /* END OUTPUT UNTUK PEMBELIAN */
    }
    
    public Pembeli hapusPembeli(){ //untuk menghapus data pembelian sebelumnya alias dikurang 1
        Pembeli temp = pembeli[index];
        index = index - 1;
        return temp;
    }
    
    public void tambahPembeli(Pembeli x){ //Menambahkan data pembelian baru
        index = index + 1;
        pembeli[index] = x;
    }
    
    public Petugas(String nPetugas, int j){ //setting petugas dan maksimal pembelian
        namaPetugas = nPetugas;
        jumlah = j;
        
        pembeli = new Pembeli[jumlah];
        
        for(int i = 0; i<pembeli.length; i++){
            pembeli[i] = null;
        }
        index = -1;
    }
}
