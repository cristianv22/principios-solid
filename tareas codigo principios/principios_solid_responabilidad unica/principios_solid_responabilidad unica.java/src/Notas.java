
  public class Notas {

    

        // variables
        public static int ingles = 3;
        public static int Español = 3;
        public static int sistemas = 5;
        public static int Matematicas = 5;

        //constructor
        public Notas (int ingles, int Español, int sistemas, int Matematicas){
            this.ingles = ingles;
            this.Español = Español;
            this.sistemas = sistemas;
            this.Matematicas = Matematicas;    
        }
            
        

        //consultar
        public int getMatematicas(){
            return this.Matematicas;
        }

        public void setMatematicas(int Matematicas){
           this.Matematicas = Matematicas;
        }

        public int getsistemas(){
            return this.sistemas;
        }

        public void setsistemas(int sistemas){
            this.sistemas = sistemas;
        }
             
         public int getEspañol(){
            return this.Español;
        }

        public void setEspañol(int Español){
            this.Español = Español;
        }
        public int getingles(){
            return this.ingles;
        }

        public void setingles(int ingles){
            this.ingles = ingles;
        }

        

        public class promedio   {
   

            public static void main(String [] args) {
      
              Notas resultado = new Notas(  ingles,  Español,  sistemas, Matematicas  );
              
              

              System.out.println(" Hola la  nota de tu materia Matematicas es  " + "-" + resultado.getMatematicas());

              System. out.println(" Hola la  nota de tu materia Ingles es  " + "-" + resultado.getingles());

              System. out.println(" Hola la  nota de tu materia Español es  " + "-" + resultado.getEspañol());

              System. out.println(" Hola la  nota de tu materia sistemas es  " + "-" + resultado.getsistemas());


                   
                
            }
    
        }
        
    
    
   
    
}
