public class Guerreiro implements Atacante { 

    private int forca;
    
 
    public void setForca(int forca){
       if(forca >= 0){
           this.forca = forca;
       } else{
          System.out.println("O valor da forca é inválido")
       }
    }
 
    public int getForca(){
        return forca;
    }
 
 
    public String Atacar(){
       
    }
 
 }