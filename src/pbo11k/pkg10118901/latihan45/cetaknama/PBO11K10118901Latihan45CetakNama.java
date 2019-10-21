/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan45.cetaknama;
import java.util.*;
/**
 *
 * @author
 * NAMA     : Dedi Cahya
 * NIM      : 10118901
 * KELAS    : 11FK
 * Deslripsi program : Menampilkan Nama dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer p = new Printer();
        Scanner input = new Scanner(System.in);
        System.out.println("======Aplikasi Pencetak Nama=======");
        System.out.print("Masukan nama anda : ");
        String nama = input.nextLine();
        System.out.print("Mau cetak nama berapa kali : ");
        int jml = input.nextInt();
        p.setNama(nama);
        p.setJmlCetak(jml);
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());
      
    }
    
}
