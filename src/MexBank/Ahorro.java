
package MexBank;

public class Ahorro extends CuentaBase {
     private double interes = 0.1;
     public Ahorro(double montoActual, double apertura, double cantidad){
           super(montoActual, apertura, cantidad);
   }
     
     
     @Override
   
   public void apertura(double apertura){
       montoActual = getMontoActual()+ apertura;
       setMontoActual(montoActual);
   }
   
   public void invertir(double cantidad ){
       montoActual = getMontoActual()+ cantidad;
       montoActual += getMontoActual()* interes;
       setMontoActual(montoActual);
   }
   
   @Override
   public double consultaSaldo(){
     return getMontoActual();
   
   
   }
}
