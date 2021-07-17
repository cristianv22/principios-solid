import java.io.Console;
import java.util.Scanner;
 public interface Envio{

    Scanner in =new Scanner(System.in);
    public static void calcular(int peso, String destino){

    }
       

}

 class ShippingInternacional implements Envio{

    public static void calcular( int peso, String destino){
         
        
        System.out.println("Cual es el destino que deseas elejir" +" - "+ destino);
        destino = in.nextLine();
 
        System.out.println("Cual es el peso que deseas enviar" + "-" + peso);
        peso = in.nextInt(); 
        
        if(peso > 0){
            System.out.println("el peso es adecuado ");

        }else if (peso <= 0){
            System.out.println("El peso no puede ser 0");
        }    
    }






    public static void main(String[] args) {
        calcular(0, "");

        
    }

}
