/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * NAma  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk menampilkan waktu saat ini
 * 
 * 
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TI_23215057_Latihan26 {
    public static void main(String[] args) {
        LocalDateTime waktuSekarang = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String waktuFormat = waktuSekarang.format(formatter);
        
        System.out.println("Hari ini adalah hari : " + waktuFormat);
    }
}
