public class Fattore3 extends Thread {
    private double c; // valore
    // (8 - 3c)
    public Fattore3(double c){
        this.c = c;
    }
    
    @Override
    public void run(){
        System.out.println("Sono il thread del fattore 3 (8 - 3c)");
        System.out.println("Questo e' il risultato del mio fattore: " + getEspressione() + "\n");
    }

    public double getEspressione(){
        return (8 - 3*c);
    }


}
