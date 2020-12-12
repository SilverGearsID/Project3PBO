/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programdatamhs;

import java.util.ArrayList;

/**
 *
 * @author Rizky Alif
 */
public class DataMhs {
    
    ArrayList<Mahasiswa> dataMhs = new ArrayList<Mahasiswa>();
    
    void tambahData(Mahasiswa data){
        this.dataMhs.add(data);
        System.out.println("");
        System.out.println("Anda berhasil menambahkan data");
    }
    
    void hapusData(String nim){
        this.dataMhs.removeIf(item -> (item.nimMhs == null ? nim == null : item.nimMhs.equals(nim)));
        System.out.println("");
        System.out.println("Anda berhasil menghapus data");
    }
    
    void cariDataNim(String nim){
        boolean stop = false;
        int index = -1;
        for(int i=0; i<this.dataMhs.size(); i++){
            if (this.dataMhs.get(i).nimMhs == null ? nim == null : this.dataMhs.get(i).nimMhs.equals(nim)){
                index = i;
                stop = true;
            }
        }
        if (stop == true){
            this.dataMhs.get(index).print();
        }
        else{
            System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
    
    void cariDataGender(int gender){
        boolean stop = false;
        int index = -1;
        for(int i=0; i<this.dataMhs.size(); i++){
            if (this.dataMhs.get(i).genderMhs == gender){
                index = i;
                stop = true;
            }
        }
        if (stop==true){
            this.dataMhs.get(index).print();
        }
        else{
            System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
    
    void lihatData(){
        for(Mahasiswa item: this.dataMhs){
            item.print();
        }
    }
}
