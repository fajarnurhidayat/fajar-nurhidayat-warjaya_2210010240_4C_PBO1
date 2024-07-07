
package PBO;

//inheritance
public class Pemainboladata extends Pemainbola {
 //overriding
    public Pemainboladata(String nama, String id) {
        super(nama, id);
    }
public int getTahunmasuk(){
    return Integer.parseInt(getId().substring(0,2)) + 2000;
}

public String getAsalclub(){
 String kodeClub = getId().substring(2, 4);
 //seleksi
 if(kodeClub.equals("12")){   
 return "inggris";
     } else {
    return "negara lain";
   }
 
}

public String getNamaclub(){
    String kodeNamaclub = getId().substring(4, 6);
    //seleksi switch
    switch (kodeNamaclub){
        case "55":
            return "manchaster city";
        case"56":
            return "manchaster united";
        default:
            return "club lain";
    }
    
}

public int getNourut(){
    return Integer.parseInt(getId().substring(6));
}

//polymorphism (overriding)
public String displayInfo(){
    return super.displayinfo()+
            "\nTahunmasuk: "+getTahunmasuk()+
            "\nAsalclub: "+getAsalclub()+
            "\nNamaclub "+getNamaclub()+
            "\nNourut "+getNourut();

    }
    
}
