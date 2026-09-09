public class Arqueiro implements Atacante { 

   private int precisao;
   

   public void setPrecisao(int precisao){
      if(precisao >= 0){
          this.precisao = precisao;
      } else{
         System.out.println("O valor da precisão é inválido")
      }
   }

   public int getPrecisao(){
       return precisao;
   }


   public String Atacar(){
      
   }

}