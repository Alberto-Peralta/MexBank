
package MexBank;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double dinero;
        Scanner entrada = new Scanner(System.in);
        
        Debito debito = new Debito(0, 0, 0);
        Ahorro ahorro = new Ahorro(0, 0, 0);
        Credito credito = new Credito(0, 0, 0);
        
        System.out.println("Cuenta de Credito");
        System.out.println("Tu saldo actual es: "+credito.consultaSaldo());
        
        
        
        System.out.print("Ingrese el monto para sumar interes: ");
        dinero = entrada.nextDouble();
        credito.sumarInteres(dinero);
        
        System.out.println("Solisitaste: "+dinero+ " Tu saldo actual es: "+credito.consultaSaldo());

        
        System.out.println("Cuenta de Ahorro");
        System.out.print("Ingrese el monto de apertura: ");
        dinero = entrada.nextDouble();
        ahorro.apertura(dinero);
        
        System.out.println("Ingresaste: "+dinero+ " Tu saldo actual es: "+ahorro.consultaSaldo());
        System.out.print("Ingrese el monto a invertir: ");
        dinero = entrada.nextDouble();
        ahorro.invertir(dinero);
        
        System.out.println("Invertiste: "+dinero+ " Tu saldo actual es: "+ahorro.consultaSaldo());
        
        
  
        
        System.out.println("Cuenta de Debito");
        System.out.print("Ingrese el monto de apertura: ");
        dinero = entrada.nextDouble();
        debito.apertura(dinero);
        
        System.out.println("Ingresaste: "+dinero+ " Tu saldo actual es: "+debito.consultaSaldo());
        
        
        System.out.print("Ingrese el monto a retirar: ");
        dinero = entrada.nextDouble();
        debito.retirar(dinero);
        
        System.out.println("Retiraste: "+dinero+ " Tu saldo actual es: "+debito.consultaSaldo());

        
    }
            
}
