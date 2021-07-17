public interface Iinteracciones {
    
        public void verResenas();


        public interface Libro extends Iinteracciones{

                public void buscarusados();
                
                  public void buscarporautor();
                
               
        } 

        public interface Audiolibro extends Iinteracciones{

               public void escucharMuestra();

               public void calificaraudiolibro();

               public void buscarporautor();

        }

        public static void main(String []args){                
        }


    
}
