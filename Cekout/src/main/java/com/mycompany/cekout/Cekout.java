package com.mycompany.cekout;
public class Cekout {

    public static void main(String[] args) {
        Belanja_Skuyyy bs = new Belanja_Skuyyy();
        bs.setNama_barang("Baju");
        bs.setharga_barang(500000);
        bs.setjumlah_barang(2);
        
        
        System.out.println("Nama Barang     : "+bs.getNama_barang());
        System.out.println("Harga Barang    : "+bs.getharga_barang());
        System.out.println("Jumlah Barang   : "+bs.getJumlah_barang());
        System.out.println("Total Harga     : "+bs.getTotal_harga());
        
    }
}
