 interface Logininterface{ 

     public void autenticar(int usuario);

     public class Autenticacionsimple implements Logininterface{
          
          public void autenticar( int usuario){
                
          }
     }
     
      public class Autenticaciónexterna  implements Logininterface{

          public void autenticar(int usuario){
              
          }  
      }
      
      
      public class loginservice {

          public void login(Logininterface usuario){
               
          }
          
      }

      public static void main(String[] args){
         
      }

      
          
}
