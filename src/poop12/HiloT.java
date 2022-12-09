package poop12;
/**
 *
 * @author Yean
 */
public class HiloT extends Thread{

    public HiloT(String name) {
        super(name);
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración "+(i+1)+" de "+ getName());
        }
        System.out.println("Termina el "+ getName());
    }
    
    
    
}
