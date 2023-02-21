
package com.mycompany.uas_encapsulasi;

public class UAS_ENCAPSULASI {

    public static void main(String[] args) {
        MAHASISWA m = new MAHASISWA();
        m.setnama("LOLA PRASTIKA HASIBUAN");
        m.setjurusan("REKAYASA PERANGKAT LUNAK");
        m.setmatkul("PEMROGRAMAN BERORIENTASI OBJEK");
        m.setnim("21090087");
        
        System.out.println("Nama    : "+m.getnama());
        System.out.println("Jurusan : "+m.getjurusan());
        System.out.println("Matkul  : "+m.getmatkul());
        System.out.println("Nim     : "+m.getnim());
           
    }

    }

