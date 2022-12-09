package poop12;
/**
 *
 * @author poo01alu16
 */
public class HiloR implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración "+(i+1)+" de "+ Thread.currentThread().getName()); 
        }
        System.out.println("Termina el "+ Thread.currentThread().getName());
    }
    
    
    
    
    
    
}
