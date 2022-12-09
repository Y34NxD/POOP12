package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yean
 */
public class Cuenta  extends Thread{
    private static double saldo;

    public Cuenta(String name) {
        super(name);
        saldo = 0;
    }

    public static double consultarSaldo() {
        return saldo;
    }

    public synchronized void depositarDinero(double monto) {
        saldo += monto;
        System.out.println("Depositando... Saldo: $"+saldo);
        notifyAll();
    }
    
    public synchronized void retiraraDinero(double monto){
        if(monto > saldo){
            System.out.println(getName()+" debe esperar un deposito Saldo: "+saldo);
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());

            }
        }
        else{
            saldo -= monto;
            System.out.println(getName()+" extrajo la cantidad $"+monto+" \tSaldo actual "+saldo);
        }
        notifyAll();
    }
    
    @Override
    public void run(){
        if(getName().equals("Deposito") || getName().equals("Deposito"))
            this.depositarDinero(100);
        else
            this.retiraraDinero(50);
    }
    
    
}
