package poop12;
/**
 *
 * @author Yean
 */
public class POOP12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  
        HiloT primero = new HiloT("Primer Hilo");
        primero.start();
        new HiloT("Segundo hilo").start();
        
        new Thread(new HiloR(),"Tercer hilo").start();
        new Thread(new HiloR(),"Cuarto hilo").start();
        */
        /*
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        */
        
        for (int i = 0; i < 25; i++) {//Par deposito y retiro
            new Cuenta("Deposito").start();
            new Cuenta("Retiro").start();
        }
        
        
        
        
    }  
}
