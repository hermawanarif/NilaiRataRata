/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javateori1;
import java.util.Scanner;

public class JavaTeori1 {

    public static void main(String[] args) {
       Scanner q = new Scanner (System.in);
        int tanggal, bulan, tahun, maxtgl = 0, mod;
        
        try{
        System.out.print("Masukkan Tanggal = ");
        tanggal = q.nextInt();
        System.out.print("Masukkan Bulan = ");
        bulan = q.nextInt();
        System.out.print("Masukkan Tahun = ");
        tahun = q.nextInt();
        mod=tahun%4;
        
        switch (bulan) {
            case 1:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Januari Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan januari Tahun " + tahun);}
                break;
            case 2:
                if(mod==0){
                    maxtgl=29;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Februari Tahun " + tahun);
                        }
                else {
                    maxtgl=28;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Februari Tahun " + tahun);}
                break;
                case 3:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Maret Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Maret Tahun " + tahun);}
                break;
                case 4:
                if(mod==0){
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan April Tahun " + tahun);
                        }
                else {
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan April Tahun " + tahun);}
                break;
                case 5:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Mei Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Mei Tahun " + tahun);}
                break;
                case 6:
                if(mod==0){
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Juni Tahun " + tahun);
                        }
                else {
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Juni Tahun " + tahun);}
                break;
                case 7:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan juli Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Juli Tahun " + tahun);}
                break;
                case 8:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Agustus Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Agustus Tahun " + tahun);}
                break;
                case 9:
                if(mod==0){
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan September Tahun " + tahun);
                        }
                else {
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan September Tahun " + tahun);}
                break;
                case 10:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Oktober Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Oktober Tahun " + tahun);}
                break;
                case 11:
                if(mod==0){
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan November Tahun " + tahun);
                        }
                else {
                    maxtgl=30;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan November Tahun " + tahun);}
                break;
                case 12:
                if(mod==0){
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan Desember Tahun " + tahun);
                        }
                else {
                    maxtgl=31;
                    if(tanggal>maxtgl){
                    System.out.println("Maaf tanggal tidak sesuai");
                    }
                    else System.out.println("Tanggal " + tanggal + " Bulan desember Tahun " + tahun);}
                break;
            default:
                System.out.println("Silahkan Masukkan Bulan 1 - 12");;
        
        }
        
        }catch(Exception e){
            System.out.println("Error!!!!, silahkan masukkan angka");
        }
        
    }
    
}
