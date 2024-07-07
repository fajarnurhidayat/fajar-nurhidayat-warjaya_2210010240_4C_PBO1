
package PBO;

//class
public class Pemainbola {
    //atribut dan enxaplition
    private String nama;
    private String id;

    //constructor

    public Pemainbola(String nama, String id) {
        this.nama = nama;
        this.id = id;
    
    
        
         
    }
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //getter
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
    public String displayinfo(){
        return "nama: "+getNama()+"\nid: "+getId();
    }
    //polymostism(overloading)
    public String displayinfo (String kelas){
        return displayinfo() + "\nkelas: "+kelas;
    }
    
    
}
