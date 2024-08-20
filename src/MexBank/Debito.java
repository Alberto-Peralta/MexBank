
package MexBank;


public class Debito extends CuentaBase{
    
   public Debito(double montoActual, double apertura, double cantidad){
           super(montoActual, apertura, cantidad);
   }

    @Override
   
   public void apertura(double apertura){
       montoActual = getMontoActual()+ apertura;
       setMontoActual(montoActual);
   }
   
   
   public void retirar(double cantidad){
       montoActual = getMontoActual() - cantidad;
       setMontoActual(montoActual);
   }
   
   @Override
   public double consultaSaldo(){
     return getMontoActual();
   
   
   }
  
}
