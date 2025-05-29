public class Fattore1 extends Thread {
    // (3 + 2a)
    private double a; // valore
    public Fattore1(double a){
        this.a = a;
    }
    
    @Override
    public void run(){
        System.out.println("Sono il thread del fattore 1 (3 + 2a) ");
        System.out.println("Questo e' il risultato del mio fattore: " + getEspressione() + "\n");
    }

    public double getEspressione(){
        return (3 + 2*a);
    }

}
