/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programdatamhs;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Rizky Alif
 */
public class ProgramDataMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataMhs data = new DataMhs();
        
        boolean stop = false;
        boolean menu1 = false;
        boolean menu2 = false;
        boolean menu3 = false;
        boolean menu4 = false;
        
        while (stop == false){
            System.out.println("========== Program Data Mahasiswa ==========");
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Hapus Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa");
            System.out.println("4. List Data Mahasiswa");
            System.out.println("5. Keluar Program");
            System.out.println("");
            System.out.println("*Ketik 1, 2, 3, atau 4 lalu enter");
            
            Scanner menu = new Scanner(System.in);
            int jawabMenu = menu.nextInt();
            
            if (jawabMenu == 1){
                menu1 = false;
                while (menu1 == false){
                    System.out.println("----- Tambah Data Mahasiswa -----");
                    System.out.println("");
                    System.out.println("Nama Mahasiswa:");
                    Scanner namaMhs = new Scanner(System.in);
                    String nama = namaMhs.nextLine();
                    
                    System.out.println("NIM Mahasiswa:");
                    Scanner nimMhs = new Scanner(System.in);
                    String nim = nimMhs.nextLine();
                    
                    System.out.println("Gender Mahasiswa: *0=Laki-laki, 1=Perempuan*");
                    Scanner genderMhs = new Scanner(System.in);
                    int gender = genderMhs.nextInt();
                    
                    System.out.println("Tanggal Lahir Mahasiswa: *Format: dd/MM/yyyy*");
                    Scanner tglLahirMhs = new Scanner(System.in);
                    
                    try{
                        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                        String tglLahir = tglLahirMhs.nextLine();
                        Date newDate = date.parse(tglLahir);
                        
                        data.tambahData(new Mahasiswa(nim, nama, newDate, gender));
                    }
                    catch(Exception e){
                        System.out.println("error");
                        break;
                    }
                    
                    System.out.println("");
                    System.out.println("Apakah anda ingin kembali ke main menu? *Y/N*");
                    Scanner yesOrNo = new Scanner(System.in);
                    char jawabYesOrNo = yesOrNo.next().charAt(0);
                    
                    if (jawabYesOrNo == 'y' || jawabYesOrNo == 'Y'){
                        menu1 = true;
                    }
                    else{
                        System.out.println("Terima kasih telah menggunakan program ini :)");
                        System.out.println("Program ini dibuat oleh:");
                        System.out.println("K3519072 - Rizky Alif Septian Tegar");
                        stop = true;
                        menu1 = true;
                    }
                }
            }
            
            else if (jawabMenu == 2){
                menu2 = false;
                while(menu2 == false){
                    System.out.println("----- Hapus Data Mahasiswa -----");
                    System.out.println("");
                    System.out.println("NIM Mahasiswa:");
                    Scanner nimMhs = new Scanner(System.in);
                    String nim = nimMhs.nextLine();
                    data.hapusData(nim);
                    
                    System.out.println("");
                    System.out.println("Apakah anda ingin kembali ke main menu? *Y/N*");
                    Scanner yesOrNo = new Scanner(System.in);
                    char jawabYesOrNo = yesOrNo.next().charAt(0);
                    
                    if (jawabYesOrNo == 'y' || jawabYesOrNo == 'Y'){
                        menu2 = true;
                    }
                    else{
                        System.out.println("Terima kasih telah menggunakan program ini :)");
                        System.out.println("Program ini dibuat oleh:");
                        System.out.println("K3519072 - Rizky Alif Septian Tegar");
                        stop = true;
                        menu2 = true;
                    }
                }
            }
            
            else if (jawabMenu == 3){
                menu3 = false;
                while (menu3 == false){
                    System.out.println("----- Cari Data Mahasiswa ------");
                    System.out.println("");
                    System.out.println("1. Cari Menggunakan NIM");
                    System.out.println("2. Cari Menggunakan Gender");
                    System.out.println("*Ketik 1, atau 2 lalu enter");
                    Scanner submenu = new Scanner(System.in);
                    int jawabSubmenu = submenu.nextInt();
                    
                    if (jawabSubmenu == 1){
                        System.out.println("NIM Mahasiswa:");
                        Scanner nimMhs = new Scanner(System.in);
                        String nim = nimMhs.nextLine();
                        data.cariDataNim(nim);
                    }
                    
                    else if (jawabSubmenu == 2){
                        System.out.println("Gender Mahasiswa: ");
                        Scanner genderMhs = new Scanner(System.in);
                        int gender = genderMhs.nextInt();
                        data.cariDataGender(gender);
                    }
                    
                    System.out.println("");
                    System.out.println("Apakah anda ingin kembali ke main menu? *Y/N*");
                    Scanner yesOrNo = new Scanner(System.in);
                    char jawabYesOrNo = yesOrNo.next().charAt(0);
                    
                    if (jawabYesOrNo == 'y' || jawabYesOrNo == 'Y'){
                        menu3 = true;
                    }
                    else{
                        System.out.println("Terima kasih telah menggunakan program ini :)");
                        System.out.println("Program ini dibuat oleh:");
                        System.out.println("K3519072 - Rizky Alif Septian Tegar");
                        stop = true;
                        menu3 = true;
                    }
                }
            }
            else if (jawabMenu == 4){
                menu4 = false;
                while (menu4 == false){
                    System.out.println("----- List Data Mahasiswa -----");
                    System.out.println("");
                    data.lihatData();
                    
                    System.out.println("");
                    System.out.println("Apakah anda ingin kembali ke main menu? *Y/N*");
                    Scanner yesOrNo = new Scanner(System.in);
                    char jawabYesOrNo = yesOrNo.next().charAt(0);
                    
                    if (jawabYesOrNo == 'y' || jawabYesOrNo == 'Y'){
                        menu4 = true;
                    }
                    else{
                        System.out.println("Terima kasih telah menggunakan program ini :)");
                        System.out.println("Program ini dibuat oleh:");
                        System.out.println("K3519072 - Rizky Alif Septian Tegar");
                        stop = true;
                        menu4 = true;
                    }
                }
            }
            else{
                stop = true;
            }
        }
        System.out.println("");
        System.out.println("========== Program Data Mahasiswa ==========");
        System.out.println("");
        System.out.println("Terima kasih telah menggunakan program ini :)");
        System.out.println("Program ini dibuat oleh:");
        System.out.println("K3519072 - Rizky Alif Septian Tegar");
    } 
}
