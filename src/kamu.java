/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA  :Alvin Lukman Nulhakim
 * NIM   :10117095    
 * KELAS :IF-3
 */
public class kamu {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Age objAge = new Age(2018);
        System.out.print("Masukan tahun Lahir Anda : ");
        objAge.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objAge.getYearBirth());
        System.out.println("Hari ini Tahun : "+objAge.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+objAge.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "+objAge.tandanyaKamu(objAge.hitungUmur()));
        
    }
    
}
