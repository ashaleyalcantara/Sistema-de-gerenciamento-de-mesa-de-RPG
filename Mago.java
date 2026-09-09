public class Mago implements Atacante { 

    private int inteligencia;
    
 
    public void setInteligencia(int inteligencia){
       if(inteligencia >= 0){
           this.inteligencia = inteligencia;
       } else{
          System.out.println("O valor da inteligencia é inválido")
       }
    }
 
    public int getInteligencia(){
        return inteligencia;
    }
 
 
    public String Atacar(){
       
    }
 
 }