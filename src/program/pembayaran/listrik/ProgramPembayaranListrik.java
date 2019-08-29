/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pembayaran.listrik;

import java.util.Scanner;

/**
 *
 * @author yusri
 */
public class ProgramPembayaranListrik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input
        double Biaya ;    
        double Kwh;     
        double Tarif;
        float Pajak;
        double Total;
         
        System.out.println("==Tagihan Pembayaran Listrik==");
        //Golongan A
        Tarif=50000;
        Kwh=300;
        Pajak=2500;
        //Golongan B
        Tarif=35000;
        Kwh=2500;
        Pajak=2300;
        //Golongan C
        Tarif=20000;
        Kwh=100;
        Pajak=2000;
        
        //input scanner
         Scanner scanner=new Scanner(System.in);
         System.out.println("Masukan Berapa Tarif anda 1 bulan:");
         Tarif=scanner.nextInt();
         
         //proses
         if(Tarif>900){  
          System.out.println("Golongan A ");
         } else if(Tarif>450){
          System.out.println("Golongan B");
         } else {
            System.out.println("Golongan C");
    }
          //Pajak
         Pajak=23000;
          // Biaya
         Biaya= Tarif+(Kwh);
         System.out.println("Biaya:"+Biaya);
         // Total
        Total=Biaya+Pajak;
        System.out.println("Total:"+Total);
         
                
    }
    
}
