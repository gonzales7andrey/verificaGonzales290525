public class Fattore2 extends Thread {
    private double b; // valore
    // (5b - 7) 
    public Fattore2(double b){
        this.b = b;
    }
    
    @Override
    public void run(){
        System.out.println("Sono il thread del fattore 2 (5b - 7) ");
        System.out.println("Questo e' il risultato del mio fattore: " + getEspressione() + "\n");
    }

    public double getEspressione(){
        return (5*b - 7);
    }

}
