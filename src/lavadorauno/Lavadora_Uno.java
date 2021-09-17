
package lavadorauno;
import libreria.LLFunciones; // importando la clase llfunciones
import java.util.Scanner; // importando la libreria scanner para pedir que introduzca datos
                          // el cliente

public class Lavadora_Uno {
   public static  void main (String[] args){
       Scanner entrada = new Scanner(System.in);  // instanciando
       
       System.out.println("¿la ropa es blanca o de color?");
       System.out.println("presiona 1 - ropa blanca / presiona 2 - ropa color");
       int TipoDeRopa = entrada.nextInt();
       
       System.out.println("¿cuantos kilos de ropa es?");
       int kilos = entrada.nextInt(); // se recupera lo que el cliente haya escrito
       
       // para la instancia de clases ( es cuando dos clases se comunican entre si)
       // para ello se creara un objeto del tipo de la clase de la que se quiere comunicar
       
          LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa); // instancia de clases
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoDeRopa()); // consulta valores
       mensajero.CicloFinalizado();
   }
}
