/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programdatamhs;
import java.util.Date;

/**
 *
 * @author Rizky Alif
 */
public class Mahasiswa {
    String nimMhs;
    String namaMhs;
    Date tglLahirMhs;
    int genderMhs;
    
    Mahasiswa(String nim, String nama, Date tglLahir, int gender){
        this.nimMhs = nim;
        this.namaMhs = nama;
        this.tglLahirMhs = tglLahir;
        this.genderMhs = gender;
    }
    
    void print(){
        System.out.println("Nama Mahasiswa: " + this.namaMhs);
        System.out.println("NIM Mahasiswa:  " + this.nimMhs);
        System.out.println("Tanggal Lahir Mahasiswa : " + this.tglLahirMhs);
        System.out.println("Jenis Kelamin Mahasiswa : " + this.genderMhs);
    }
}
