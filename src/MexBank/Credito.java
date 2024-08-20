
package MexBank;


public class Credito extends CuentaBase {
     private double interes = 0.15;
     public Credito(double montoActual, double apertura, double cantidad){
           super(montoActual, apertura, cantidad);
   }
     
     
     public void sumarInteres(double cantidad){   
         montoActual = getMontoActual() - cantidad;
         montoActual += getMontoActual()* interes;
         setMontoActual(montoActual);
       
     }
     
     @Override
   public double consultaSaldo(){
       double deuda = -200;
       montoActual = getMontoActual() + deuda;
       return getMontoActual(); 
   }
}

