/*
* clase para las funviones logicas de una lavadora
*/
package libreria;

public class LLFunciones {
/* encapsulamiento */ private int kilos= 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;
    public LLFunciones(int kilos, int TipoDeRopa){ // instancia ( construcctor)
       this.kilos = kilos;  
       this.TipoDeRopa = TipoDeRopa;
        
    }
    
    // se agregara los metodos 
    private void Llenado(){
        if(getKilos() <= 12){
            setLlenadoCompleto(1);
            System.out.println("llenando.....");
            System.out.println("Llenado completo.");
        }else{
            System.out.println("la carga de ropa es muy pesada, reducir la carga ");
        }
    }
     private void Lavado(){
         Llenado();
         if(getLlenadoCompleto() == 1){
             if(TipoDeRopa == 1){
                 System.out.println("Ropa blanca / lavado suave.");
                 System.out.println("lavando....");
                 setLavadoCompleto(1);
             }else if(TipoDeRopa == 2){
                 System.out.println("Ropa a color / lavado intenso");
                 System.out.println("lavando....");
                 setLavadoCompleto(1);
         } else {
                 System.out.println("El tipo de ropa no esta disponible ");
                 System.out.println("se lavara como ropa a color / lavado intenso");
                 setLavadoCompleto(1);
             } 
         }
     }
     private void Secado(){
         Lavado();
         if(getLavadoCompleto() == 1){
             System.out.println( " secando.... ");
             setSecadoCompleto(1);
         }
     }
     
  /* para que otros programadores puedan importar este metodo */   
     public void CicloFinalizado(){  // el metodo para importar en otros proyectos
         Secado();
         if(getSecadoCompleto() == 1){
             System.out.println("Tu ropa esta lista. ");
         }
     }
          
     //metodos getter y setter nos permitira ingresar a los atibutos de tipo privado
     
     
    public int getTipoDeRopa(){
        return TipoDeRopa;
    }
     
     public void setTipoDeRopa(int TipoDeRopa){ // EL VOID oBLIGA AL METOD A RETORNAR UN VALOR
       this.TipoDeRopa = TipoDeRopa;         
     }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the llenadoCompleto
     */
    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    /**
     * @param llenadoCompleto the llenadoCompleto to set
     */
    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    /**
     * @return the LavadoCompleto
     */
    public int getLavadoCompleto() {
        return LavadoCompleto;
    }

    /**
     * @param LavadoCompleto the LavadoCompleto to set
     */
    public void setLavadoCompleto(int LavadoCompleto) {
        this.LavadoCompleto = LavadoCompleto;
    }

    /**
     * @return the SecadoCompleto
     */
    public int getSecadoCompleto() {
        return SecadoCompleto;
    }

    /**
     * @param SecadoCompleto the SecadoCompleto to set
     */
    public void setSecadoCompleto(int SecadoCompleto) {
        this.SecadoCompleto = SecadoCompleto;
    }
    
}
