
package PBO;

import java.util.Scanner;


public class Bolajaya {
    public static void main(String[] args){
     //objek
    //emainbola pbl = new Pemainbola("fajar nurhidayatb watjaya","111225501");
      //System.out.println(pbl.displayinfo());
        //stem.out.println(pbl.displayinfo("4c"));
 
       Scanner scanner = new Scanner (System.in);
       
       //array
       Pemainboladata[] pbl = new Pemainboladata[2];
        System.out.println("masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.println("masukkan id anda: ");
        String id = scanner.nextLine();
        
        //OBJEK
        pbl[0] = new Pemainboladata(nama, id);
        
        System.out.println(pbl[0].displayinfo());
        
       
       
        
        
    }
    
}
