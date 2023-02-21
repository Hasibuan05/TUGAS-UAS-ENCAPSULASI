package com.mycompany.cekout;
public class Belanja_Skuyyy {
    private String nama_barang;
    private int Jumlah_Barang;
    private int Harga_Barang;

    
    public String getNama_barang(){
        return nama_barang;
    }
    public void setNama_barang(String newnama_barang){
        this.nama_barang=newnama_barang;
    }
    public int getJumlah_barang(){
        return Jumlah_Barang;
    }
    public void setjumlah_barang(int NewJumlah_Barang){
        this.Jumlah_Barang=NewJumlah_Barang;
    }
    
    public int getharga_barang(){
        return Harga_Barang;
    }
    public void setharga_barang(int Newharga_barang){
        this.Harga_Barang=Newharga_barang;
    }

    
    
    public Belanja_Skuyyy(){
        int jb=0;
        int hb=0;
     
        
    }  
        public int Total_harga(int jb,int hb){
            return jb*hb;
            
        }
        public int getTotal_harga(){
            return Total_harga(Jumlah_Barang,Harga_Barang);
        }
    
}
       
    

